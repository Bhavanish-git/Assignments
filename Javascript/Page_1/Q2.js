function max(arr) {

    var temp = arr[0];

    for (var i = 1; i < arr.length; i++) {

        if (arr[i] > temp){ 

            temp = arr[i];
        }
    }

    return temp;
}

document.write("The maximum value is :   " + max([3,67,8]));