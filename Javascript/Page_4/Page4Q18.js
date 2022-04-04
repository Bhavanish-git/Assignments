function perfectSquares(l, r){
 
    //For every element from the range
    for (let i = l; i <= r; i++)
    {
   
        // If current element is
        // a perfect square
        if (Math.sqrt(i) == parseInt(Math.sqrt(i)))
            document.write(i + " ");
    }
}
 
let l = 2;
let r = 24;
perfectSquares(l, r)