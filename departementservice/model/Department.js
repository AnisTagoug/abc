const mongoose = require("mongoose");

const DepartmentSchema = new mongoose.Schema(
  {
    title: { type: String, required: false },
  }
);

module.exports = mongoose.model("Department", DepartmentSchema);
