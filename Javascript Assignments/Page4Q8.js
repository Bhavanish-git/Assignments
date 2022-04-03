var num = prompt("Enter the number");

for(i=1 ; i<=num ; i++){

    count=0;

    for (j=2 ; j<=2 ; j++){

        if(i%j == 0){

            count++;
            break;
        }
    }

    if(count == 0 && i != 1){
        document.write(i+" ");
    }
}