for (i = 0; i < 3; i++){

    var star = "*";
    var num = prompt("Enter Number between 1 to 30");

    if(num <= 30 && num <= 1 || !isNaN(num)){

        document.write(star.repeat(num)+"<br>");
    }
    else{
        document.write("Number is not between the specified range")
    }
}