const http = require("http");

const server = http.createServer((req, res) => {
  switch (req.url) {
    case "/":
      res.end("Home Page");
      break;
    case "/about":
      for (let i = 0; i < 1000; i++) {
        for (let j = 0; j < 1000; j++) {
          console.log(`${i}${j}`);
        }
      }
      res.end("About Page");
      break;
    default:
      res.end("Error Page");
  }
});

server.listen(5000, () => {
  console.log("Server is listening on port 5000...");
});
