function runningSum (num)  {

    for(i = 1 ; i < num.length ; i++) {
      num[i] = num[i] + num[i-1];
    }

     return num;
}


var num = [1,2,3,4,5];
document.write(runningSum(num));