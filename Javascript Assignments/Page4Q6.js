var n = prompt ("Enter the number : ");
var sum=0;
var product = 1;

var choice = prompt ("Choose 1 for sum or 2 for product");

if (choice == 1){

    for (i=1 ; i<=n ; i++){
        sum+=i;
    }
document.write("The sum is : "+ sum);

}

else if (choice == 2){

        for(i=1 ; i<=n; i++){
            product*=i;
        }
    
document.write("The product is : "+ product);
        
}

else{

    document.write("Enter a valid number ");
}