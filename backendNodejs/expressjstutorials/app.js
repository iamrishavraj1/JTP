const express = require("express");
const logger = require("./logger");
const autorize = require("./autorize");
const app = express();

// const logger = (req, res, next) => {
//   const method = req.method;
//   const url = req.url;
//   const time = new Date().getFullYear();
//   console.log(method, url, time);
//   next();
// };

app.use([logger, autorize]);

// app.get("/",logger, (req, res) => {
//   res.send("Hello");
// });

app.get("/", (req, res) => {
  console.log(req.user);
  res.send("Hello Home");
});
app.get("/about", (req, res) => {
  res.send("Hello About");
});

app.listen(5000, () => {
  console.log("Server is Listening on port 5000...");
});
