const mongoose = require("mongoose");
const TaskScheme = new mongoose.Schema({
  name: {
    type: String,
    required: [true, "Must Provide name"],
    trim: true,
    maxLength: [20, "name can not be more than 20 characters"],
  },
  completed: {
    type: Boolean,
    default: true,
  },
});

module.exports = mongoose.model("Task", TaskScheme);
