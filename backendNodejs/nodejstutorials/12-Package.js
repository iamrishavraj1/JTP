//npm - global command, comes with node
//npm --version

//local dependency - use it only in this particular project
//npm i <packageName>

//gloabal dependency - use it in any project
//npm install -g <packageName>
//sudo install -g <packageName> (mac,linux)

const _ = require("lodash");
const items = [1, [2, [3, [44]]]];
const newItems = _.flattenDeep(items);
console.log(newItems);
