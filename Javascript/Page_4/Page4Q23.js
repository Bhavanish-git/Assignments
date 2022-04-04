function fibonacci (n){

    var n1 = 0;
    var n2 = 1;
    var nextTerm;

    for (let i = 1; i <= n; i++) {
        document.write(n1 + " ,  ");
        nextTerm = n1 + n2;
        n1 = n2;
        n2 = nextTerm;
    }

}

var n = 100;
fibonacci(n);
