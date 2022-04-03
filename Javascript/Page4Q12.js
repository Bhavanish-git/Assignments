function reversed(string) {

    const arr = string.split(',');                
    const reverseArr = arr.reverse();

    document.write(reverseArr);

}

const string = prompt('Enter a list: ');
reversed(string);