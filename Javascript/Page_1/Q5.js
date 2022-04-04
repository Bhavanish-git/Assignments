function padChars( n , str){

    for (i=1 ; i<=n ; i++){

        document.write(' ' + str + "\n");
    }
}

padChars(5 , 'x');

padChars(7 , "_");