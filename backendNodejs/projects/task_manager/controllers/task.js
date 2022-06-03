const Task = require("../models/Task");
const asyncWrapper = require("../middleware/try-catch");
const { createCustomError } = require("../errors/custom-error");

const getAllTasks = asyncWrapper(async (req, res) => {
  const allTasks = await Task.find({});
  res.status(200).json({ allTasks });
});

const createTask = asyncWrapper(async (req, res) => {
  const task = await Task.create(req.body);
  res.status(201).json({ task });
});

const getTask = asyncWrapper(async (req, res, next) => {
  const { id: taskId } = req.params;
  const singleTask = await Task.findOne({ _id: taskId });
  if (!singleTask) {
    return next(
      createCustomError(`No taks found with this id :${taskId}`, 404)
    );
  }
  res.status(200).json({ singleTask });

  // res.json({ id: req.params.id });
});

const deleteTask = asyncWrapper(async (req, res) => {
  const { id: taskId } = req.params;
  const removeSingleTask = await Task.findOneAndDelete({ _id: taskId });
  if (!removeSingleTask) {
    return next(
      createCustomError(`No taks found with this id :${taskId}`, 404)
    );
  }
  res.status(200).json({ removeSingleTask });

  // res.send("Delete the Task...");
});

const updateTask = asyncWrapper(async (req, res) => {
  const { id: taskId } = req.params;
  const editTask = await Task.findOneAndUpdate({ _id: taskId }, req.body, {
    new: true,
    runValidators: true,
  });
  if (!editTask) {
    return next(
      createCustomError(`No taks found with this id :${taskId}`, 404)
    );
  }
  res.status(200).json({ editTask });
});

module.exports = {
  getAllTasks,
  getTask,
  createTask,
  updateTask,
  deleteTask,
};
