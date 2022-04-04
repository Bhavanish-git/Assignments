flips = 0;
heads = 0;


function headsRatio (x){

 for (i=0; i<=x ; i++){

       flips = flips + 1;

    if (flips % 2 !== 0){

        heads = heads + 1;

        
        }

        var ratio = heads/x ;
    
}
document.write( ratio );


}

headsRatio(10);