// ! Modules

// CommonJS , every file is module (by default)
// Modules - Encasulated Code (only share minimum)
const names = require('./4-Namedata')
const greeting = require("./5-Util")


greeting("Rounik")
greeting(names.name1)
greeting(names.name2)
console.log(names);
