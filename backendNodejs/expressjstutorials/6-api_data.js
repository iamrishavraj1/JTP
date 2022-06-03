const express = require("express");
const { products } = require("./data");
const app = express();

app.get("/", (req, res) => {
  const newProduct = products.map((product) => {
    const { id, name, image } = product;
    return { id, name, image };
  });
  res.json(newProduct);
});

app.listen(5000, () => {
  console.log("Server running on port 5000... ");
});
