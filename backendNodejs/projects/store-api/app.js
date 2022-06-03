const express = require("express");
const app = express();
const connectDB = require("./db/connectdb");
const connectProductsRouter = require("./routes/products");
require("dotenv").config();
require("express-async-errors");
const errorHandler = require("./middleware/error-handler");
const notFound = require("./middleware/not-found");

//Routes for Testing Server First Time.
app.get("/", (req, res) => {
  res
    .status(200)
    .send('<h1>Store API</h1><a href="/api/v1/products">Prodcuts</a>');
});

//middleware Products router
app.use("/api/v1/products", connectProductsRouter);

//middleware
app.use(errorHandler);
app.use(notFound);

// ! SERVER START
const port = process.env.PORT || 3000;
const start = async () => {
  try {
    await connectDB(process.env.MONGO_URI);
    app.listen(port, () => {
      return console.log(`Server is listening on port ${port}`);
    });
  } catch (error) {}
};
start();
