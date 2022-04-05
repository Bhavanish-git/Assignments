'use strict';  // --> strict mode on 

var student = ('{"firstName":"Bhavanish", "lastName" : "Sankar" }');

var obj = JSON.parse(student);

obj.middleName = "Hey";

console.log(obj.firstName);
console.log(obj.middleName);
console.log(obj.lastName);
