var student = {firstName : "Bhavanish"  , lastName : "Sankar" , class : "Person"};
student.middleName =  "nil";            
student.middleName = "hey" ;                          // Q5 - adding property to the variable

console.log(student.firstName);
console.log(student.lastName);
console.log(student.middleName);

// Q6. using eval() function 

var str = '({"firstName":"Bhavanish - 2" , "lastName":"Sankar - 2"})' ;

var obj = eval(str);

obj.middleName = "hey - 2";

console.log(obj.firstName);
console.log(obj.lastName);
console.log(obj.middleName);

