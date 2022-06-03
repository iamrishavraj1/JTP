const express = require("express");
const { products } = require("./data");
const app = express();

app.get("/api/products", (req, res) => {
  const newProduct = products.map((product) => {
    const { id, name, image, desc } = product;
    return { id, name, image, desc };
  });
  res.json(newProduct);
});
//!Params
app.get("/api/products/:productID", (req, res) => {
  const { productID } = req.params;
  const singleProduct = products.find((product) => {
    return product.id === Number(productID);
  });
  if (!singleProduct) {
    return res.status(404).send("<h1>No Product Found</h1>");
  }
  return res.json(singleProduct);
});

//!QUERY
app.get("/api/product/query", (req, res) => {
  const { search, limit } = req.query;
  let shortedProducts = [...products];
  if (search) {
    shortedProducts = shortedProducts.filter((product) => {
      return product.name.startsWith(search);
    });
  }
  if (limit) {
    shortedProducts = shortedProducts.slice(0, Number(limit));
  }
  if (shortedProducts.length < 1) {
    return res.status(200).json({ success: true, data: [] });
  }
  return res.status(200).json(shortedProducts);
  res.send("Hello");
});

app.listen(5000, () => {
  console.log("Server is listening on port 5000...");
});
