const http = require("http");
const { readFileSync } = require("fs");
const homePage = readFileSync("index.html");
const server = http.createServer((req, res) => {
  switch (req.url) {
    case "/":
      res.writeHead(200, { "content-type": "text/html" });
      res.end(homePage);
      break;
    case "/about":
      res.writeHead(200, { "content-type": "text/html" });
      res.end("<h1>Welcome About</h1>");
      break;
    default:
      res.writeHead(404, { "content-type": "text/html" });
      res.end("<h1>Error ! Page Not Found</h1>");
  }
});

server.listen(5000, () => {
  console.log("Server is listning on port 5000");
});
