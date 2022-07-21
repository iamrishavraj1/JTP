const { createCustomError } = require("../errors/custom-error");
const jwt = require("jsonwebtoken");
require("dotenv").config();
const login = async (req, res, next) => {
  const { username, password } = req.body;

  if (!username || !password) {
    return next(createCustomError("Please provide email and password", 400));
  }
  const id = new Date().getDate();
  //try to keep playload small, better exprienece for user
  const token = jwt.sign({ id, username }, process.env.JWT_SECERT, {
    expiresIn: "30d",
  });
  res.status(200).json({ msg: "user created", token });
};

const dashboard = (req, res, next) => {
  const authHeader = req.headers.authorization;
  if (!authHeader || !authHeader.startsWith("Bearer ")) {
    return next(createCustomError("No token Provided", 401));
  }

  const token = authHeader.split(" ")[1];
  try {
    const decode = jwt.verify(token, process.env.JWT_SECERT);
    const luckyNumber = Math.floor(Math.random() * 100);
    res.status(200).json({
      msg: `Hello ${decode.username}`,
      secret: `Here is your authorization data, Your Lucky Number is ${luckyNumber}`,
      success: true,
    });
    console.log(decode);
  } catch (error) {
    return next(createCustomError("No Autharization", 401));
  }
};

module.exports = { login, dashboard };
