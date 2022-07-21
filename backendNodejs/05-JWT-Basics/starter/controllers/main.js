require("dotenv");
const jwt = require("jsonwebtoken");
const customAPIError = require("../errors/custom-error");
const login = async (req, res) => {
  const { username, password } = req.body;
  if (!username || !password) {
    throw new customAPIError("Please Provide the username and password", 400);
  }
  const id = new Date().getDate();
  const token = jwt.sign({ id, username }, process.env.JWT_SECERT, {
    expiresIn: "30d",
  });
  res.status(200).json({ msg: "user created", token });
};
const dashboard = async (req, res) => {
  const authHeader = req.headers.authorization;
  if (!authHeader || !authHeader.startsWith("Bearer ")) {
    throw new customAPIError("NO TOKEN", 401);
  }
  const token = authHeader.split(" ")[1];
  try {
    const decode = jwt.verify(token, process.env.JWT_SECERT);
    const luckyNumber = Math.floor(Math.random() * 100);
    res.status(200).json({
      msg: `Hello ${decode.username}`,
      secret: `Here is your authorized data, your luck number is ${luckyNumber}`,
    });
    console.log(decode);
  } catch (error) {
    throw new customAPIError("NO Authorization", 401);
  }
  console.log(token);
};
module.exports = { login, dashboard };
