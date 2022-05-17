const http = require("http");
const server = http.createServer((req, res) => {
  switch (req.url) {
    case "/":
      res.end("Hello to Home Page");
      break;
    case "/about":
      res.end("Hello to About Page");
      break;
    default:
      res.end(`<h1>Opps Sorry !</h1> 
      <p>We can't find the page, you are looking for</p>
      <a href="/">Back to Home</a>
      `);
  }
});

server.listen(5000);
