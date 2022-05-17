const { readFile, writeFile } = require("fs");
console.log("START METHOD");
readFile("./content/first.txt", "utf8", (err, result) => {
  if (err) {
    console.log(err);
    return;
  } else {
    console.log(result);
  }
  const first = result;

  readFile("./content/second.txt", "utf8", (err, result) => {
    if (err) {
      console.log(err);
      return;
    } else {
      console.log(result);
    }
    const second = result;

    writeFile(
      "./content/result-asyn.txt",
      `Here is Asyn the method ${first}, ${second}`,
      (err, result) => {
        if (err) {
          console.log(err);
          return;
        } else {
         console.log(result);
         console.log("DONE TASK");
        }
      }
    );
  });
});
console.log("START NEXT");
