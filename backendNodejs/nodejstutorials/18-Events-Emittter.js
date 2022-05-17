const EventEmitter = require("events");
const customEmitter = new EventEmitter();

customEmitter.on("response", () => {
  console.log("DATA RECEIVED");
});

customEmitter.emit("response");
