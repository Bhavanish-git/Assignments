var arr = [30, 63, 21, 56, 32, 5, 89, 92];
var largest = arr[0];

for (var i = 0; i <= arr.length; i++) {

    if (largest < arr[i] ) {
        
        largest = arr[i];
    }
}
document.write("The largest number in the given array is : " + largest);