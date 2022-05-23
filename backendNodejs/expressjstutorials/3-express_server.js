const express = require("express");
const app = express();

app.get("/", (req, res) => {
  console.log("Server is Httting");
  res.status(200).send("<h1>Home Page</h1>");
});

app.get("/about", (req, res) => {
  res.status(200).send("<h1>Welcome About Page</h1>");
});

app.all("*", (req, res) => {
  res.status(404).send("<h1>Page Not Found 404 !</h1>");
});

app.listen(5000, () => {
  console.log("Server is Listening on port 5000");
});

//HTTP Methods
//GET - Read Data
//Post - Insert Data
//Put - Update Data
//Delete - Delete Data
//All
//USE
//Listen
