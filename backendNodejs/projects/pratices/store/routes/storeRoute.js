const express = require("express");
const router = express.Router();
const {
  getAllTaskStatic,
  getAllTask,
} = require("../controllers/storeController");

router.route("/").get(getAllTask);
router.route("/static").get(getAllTaskStatic);

module.exports = router;
 