
//Q 8

class Person {

    constructor (fname , lname , age , skills , address , dob , married , profession ){
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.skills = skills;
        this.address = address;
        this.dob = dob;
        this.married = married;
        this.proffession = profession;

    }
}

  Person1 = new Person ("Bhavanishsankar" , "G" , 24 , "Python" , {city:"chennai",pincode:"666666"} , '27.06.2001' , false , "Trainee" );

  Person2 = new Person ("hari" , "k" , 29 , "no skills" , {city:"mumbai",pincode:"999999"}  , '02.08.1997' , true , "Full stack developer" );

print=function() {               // global print
    console.log(Person1);
    console.log(Person2); }();


console.log("______________________________________________________")
    // Q 9 and 10


 amithab = new Person("amithab","bachan",22,"c",{city:"hyderabad",pincode:"521185"},"24/10/1996" , false, "sr analyst");

 abhisheik = new Person("abhisheik",21,"HTML","08/06/1997","false","jr analyst");

 var abhisheik = Object.create(amithab);  // replaces the leftout properties with amithabs properties

Aaradhya = new Person("Aaradhya",27,"Javascript","19/09/1994","true","mentor");

 var Aaradhya = Object.create(abhisheik);



print=function()
{
console.log(amithab); 
console.log(abhisheik.lname); 
console.log(abhisheik.address); 


console.log(Aaradhya);

}();




 