require("dotenv").config();
const connectDB = require("./db/connectDB");
const jsonProducts = require("./product.json");
const storeModel = require("./models/storeModel");

const start = async () => {
  try {
    await connectDB(process.env.MONGO_URI);
    await storeModel.deleteMany();
    await storeModel.create(jsonProducts);
    process.exit(0);
  } catch (error) {
    console.log(error); 
    process.exit(1);
  }
};

start();
