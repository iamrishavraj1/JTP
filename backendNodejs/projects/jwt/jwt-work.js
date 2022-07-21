//HOW JWT TOKEN CREATE
const crypto = require("crypto");

const header = {
  alg: "HS256",
  typ: "JWT",
};
const encodeHeader = Buffer.from(JSON.stringify(header)).toString("base64");
const id = new Date().getDate();
const payload = {
  message: "Anupam Randi h",
};
const encodePayload = Buffer.from(JSON.stringify(payload)).toString("base64");
const jwtSecret = "secretKey";

const signature = crypto
  .createHmac("sha256", jwtSecret)
  .update(encodeHeader + "." + encodePayload)
  .digest("base64");
const jwt = `${encodeHeader}.${encodePayload}.${signature}`;

// console.log(Buffer);
// console.log(signature);
console.log(jwt);
