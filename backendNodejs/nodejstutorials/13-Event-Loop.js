// const { readFile } = require("fs");

// console.log("Started a first task");
// readFile("./content/first.txt", "utf8", (err, result) => {
//   if (err) {
//     console.log(err);
//     return;
//   } else {
//     console.log(result);
//     console.log("Completed the task");
//   }
// });

// console.log("Starting a new task");

const http = require("http");
const server = http.createServer((req, res) => {
  console.log("Server Start");
  res.end("Hello World");
});

server.listen(5000, () => {
  console.log("Server is starting on port 5000");
});
