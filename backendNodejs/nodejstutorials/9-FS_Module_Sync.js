const { readFileSync, writeFileSync } = require("fs");
console.log('START METHOD')
const first = readFileSync("./content/first.txt", "utf-8");
const second = readFileSync("./content/second.txt", "utf-8");
console.log(first, second);

writeFileSync(
  "./content/result.txt",
  `Here is result of WFS: ${first},${second}`,
  { flag: "a" }
);
console.log("END METHOD");
console.log("START NEXT ONE");