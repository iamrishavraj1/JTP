require("dotenv").config();
require("express-async-errors");
const express = require("express");
const app = express();
const jobsroutes = require("./routes/jobsroutes");
const authroutes = require("./routes/authroutes");
// error handler
const notFoundMiddleware = require("./middleware/not-found");
const errorHandlerMiddleware = require("./middleware/error-handler");

app.use(express.json());

//!CONNECT TO DB
const connectDB = require("./db/connectDB");

//! ROUTES
app.use("/jobs", jobsroutes);
app.use("/auth", authroutes);

app.use(notFoundMiddleware);
app.use(errorHandlerMiddleware);

const port = process.env.PORT || 3000;
const start = async () => {
  try {
    await connectDB(process.env.MONGO_URI);
    app.listen(port, () => console.log(`Server is listening on ${port}....`));
  } catch (error) {
    console.log(error);
  }
};

start();
