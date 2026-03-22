const express = require("express");
const mongoose = require("mongoose");

const app = express();
app.use(express.json());

const MONGO_URL = "mongodb://mongo:27017/testdb";

// Kết nối MongoDB
mongoose.connect(MONGO_URL)
    .then(() => console.log("Connected MongoDB"))
    .catch(err => console.log(err));

// Schema
const UserSchema = new mongoose.Schema({
    name: String
});

const User = mongoose.model("User", UserSchema);

// API
app.get("/", (req, res) => {
    res.send("Node.js + MongoDB running");
});

app.post("/users", async (req, res) => {
    const user = new User(req.body);
    await user.save();
    res.json(user);
});

app.get("/users", async (req, res) => {
    const users = await User.find();
    res.json(users);
});

app.listen(3000, () => console.log("Server running on port 3000"));