require("dotenv").config();
const express = require("express");
const app = express();
const taskRoutes = require("./routes/taskRoutes");
const connectDB = require("./db/connectDB");
const notFound = require("./middleware/not-found");
const errorHandler = require("./middleware/error-handler");

//JSON Middleware
app.use(express.json());

//taskRoutes Middleware
app.use("/task", taskRoutes);

//NOT-FOUND Middleware
app.use(notFound);

//ERROR-HANDLER Middleware
app.use(errorHandler);

//! Server Start
const port = process.env.PORT || 3000;

const start = async () => {
  try {
    await connectDB(process.env.MONGO_URI);
    app.listen(port, () => console.log(`Server Started on port ${port}`));
  } catch (error) {
    console.log(error);
  }
};

start();
