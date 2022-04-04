function makeStarBox(arr){
    const longest = arr.reduce((a, b) => a.length <= b.length ? b : a);
    const box_width = longest.length + 2;
    
    document.write("*".repeat(box_width));
  
    arr.map(str => document.write("\n*" + str + " ".repeat(box_width - (str.length + 2)) + "*\n"));
  
    document.write("*".repeat(box_width));
  }

  var arr = ['hello', 'world' ,  'in' , 'a' , 'frame'];
  makeStarBox(arr);