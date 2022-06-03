require("dotenv").config();
const connectDB = require("./db/connectdb");
const Product = require("./models/prodcut");
const jsonProducts = require("./products.json");

const start = async () => {
  try {
    await connectDB(process.env.MONGO_URI);
    await Product.deleteMany();
    await Product.create(jsonProducts);
    console.log("Success");
    process.exit(0);
  } catch (error) {
    console.log(error);
    process.exit(1);
  }
};

start();
