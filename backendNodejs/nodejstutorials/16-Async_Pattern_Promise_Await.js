const { readFile } = require("fs");

const getText = (path) => {
  return new Promise((resolve, reject) => {
    readFile(path, "utf8", (err, data) => {
      if (err) {
        reject(err);
      } else {
        resolve(data);
      }
    });
  });
};
const start = async () => {
  try {
    const fisr = await getText("./content/first.txt");
    console.log(fisr);
  } catch (error) {
    console.log(err);
  }
};
start();
