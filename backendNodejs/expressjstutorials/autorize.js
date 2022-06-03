const autorize = (req, res, next) => {
  const { user } = req.query;

  if (user.toLowerCase() === "rishav") {
    req.user = { name: "Rishav Raj", id: 60012 };
    next();
  } else {
    res.status(401).send("Unautorize");
  }
};

module.exports = autorize;
