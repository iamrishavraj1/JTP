const Product = require("../models/storeModel");

//FOR TESTING ONLY
const getAllTaskStatic = async (req, res) => {
  const products = await Product.find({
    page: "2",
  });
  res.status(200).json({ products, nbHits: products.length });
};

const getAllTask = async (req, res) => {
  const { featured, company, name, sort, field, numericFilter } = req.query;
  const queryObject = {};

  //featured Queary
  if (featured) {
    queryObject.featured = featured == "true" ? true : false;
  }
  

  //company Queary
  if (company) {
    queryObject.company = company;
  }

  //name Queary
  if (name) {
    queryObject.name = { $regex: name, $options: "i" };
  }

  //numeric Queary
  if (numericFilter) {
    const operatorMap = {
      ">": "$gt",
      ">=": "$gte",
      "=": "$eq",
      "<": "$lt",
      "<=": "lte",
    };
    const regEx = /\b(<|>|>=|=|<|<=)\b/g;
    let filters = numericFilter.replace(
      regEx,
      (match) => `-${operatorMap[match]}-`
    );
    const options = ["price", "rating"];
    filters = filters.split(",").forEach((item) => {
      const [field, operator, value] = item.split("-");
      if (options.includes(field)) {
        queryObject[field] = { [operator]: Number(value) };
      }
    });
  }

  //find product from DB
  let result = Product.find(queryObject);

  //sort Queary
  if (sort) {
    const sortResult = sort.split(",").join(" ");
    result = result.sort(sortResult);
  } else {
    result = result.sort("createAt");
  }

  //field Queary
  if (field) {
    const fieldResult = field.split(",").join(" ");
    result = result.select(fieldResult);
  }

  //pagination Queary
  const page = Number(req.query.page) || 1;
  const limit = Number(req.query.limit) || 5;
  const skip = (page - 1) * limit;

  result = result.skip(skip).limit(limit);

  //Product Fetech
  const products = await result;
  res.status(200).json({ products, nbHits: products.length });
};

module.exports = { getAllTaskStatic, getAllTask };
