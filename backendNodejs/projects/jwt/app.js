require("dotenv").config();
const express = require("express");
const app = express();
const appRoutes = require("./routes/appRoute");
const errorHandlerMiddleware = require("./middleware/error-handler");


app.use(express.static("./public"));

app.use(express.json());

app.use("/jwtlogin", appRoutes);

app.use(errorHandlerMiddleware);


//! SERVER START
const port = process.env.PORT || 3000;
const start = () => {
  try {
    app.listen(port, () =>
      console.log(`Server is listening on port ${port}...`)
    );
  } catch (error) {
    console.log(error);
  }
};

start();
