require("dotenv").config();
require("express-async-errors");
const express = require("express");
const app = express();
const storeRoute = require("./routes/storeRoute");
const errorHandler = require("./middleware/error-handler");
const notFound = require("./middleware/not-found");
const connectDB = require("./db/connectDB");

app.use(express.json());

app.use("/store", storeRoute);

app.use(errorHandler);
app.use(notFound);

const port = process.env.PORT || 3000;
const start = async () => {
  try {
    await connectDB(process.env.MONGO_URI);
    app.listen(port, () => console.log(`Server is listening on port ${port}`));
  } catch (error) {
    console.log(error);
  }
};
start();
