var num = prompt("Enter the number");
var sum = 0;

for (i = 1 ; i <= num ; i++){
    
    if(i%3 == 0 || i%5 == 0){    
    sum += i;
    }
}

document.write("The sum of the numbers is " +  sum);