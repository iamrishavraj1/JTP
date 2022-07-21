const getAllJobs = async (req, res) => {
  res.status(200).send("GET ALL JOBS NOT DONE");
};

const getJob = async (req, res) => {
  res.status(200).send("GET JOB DONE");
};

const createJob = async (req, res) => {
  res.status(200).send("CREATE JOB DONE");
};

const updateJob = async (req, res) => {
  res.status(200).send("UPDATE JOB DONE");
};

const deleteJob = async (req, res) => {
  res.status(200).send("DELETE JOB DONE");
};

module.exports = { getAllJobs, getJob, createJob, updateJob, deleteJob };
