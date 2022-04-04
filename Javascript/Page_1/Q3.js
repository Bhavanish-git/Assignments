flips = 0;
heads = 0;


function numHeads (x){

 for (i=0; i<=x ; i++){

       flips = flips + 1;

    if (flips % 2 !== 0){

        heads = heads + 1;
        }
    
}
document.write( heads );


}

numHeads(10);