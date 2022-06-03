const express = require("express");
const app = express();
const task = require("./routes/tasks");
const port = process.env.PORT || 3000;
const connectDB = require("./db/connect");
require("dotenv").config();
const notFound = require("./middleware/404");
const errorMiddleware = require("./middleware/error-handler");
app.use(express.static("./public"));
app.use(express.json());

app.get("/", (req, res) => {
  res.end("<h1>Hello</h1>");
});

app.use("/api/v1/task", task);
app.use(notFound);
app.use(errorMiddleware);

const start = async () => {
  try {
    await connectDB(process.env.MONGO_URI);
    app.listen(port, () => {
      console.log(`Server is listening on port ${port}...`);
    });
  } catch (error) {
    console.log(error);
  }
};

start();
