function alt(a,b)
{
  var l = a.length + b.length;
  var r = [];
  var j=0 , k=0;

  for(i=0; i<l;i++) {

    if(i%2==0) {
      r[i]=a[j++];
    } 

    else {
      r[i]=b[k++];
    }
  }
  return r;
}

var a = ['a','b','c'];
var b = [1,2,3];
document.write("The alternate array is : " + alt(a,b));