const http = require("http");
const server = http.createServer((req, res) => {
  if (req.url == "/") {
    // res.write("Hello");
    // res.end();
    res.writeHead(200, { "content-type": "text/html" });
    res.end("<h1>Hello HOME</h1>");
  }
  console.log("User Hit The Server");
});

server.listen(5000, () => {
  console.log("Server is listning on port 5000");
});
