function palindromeCheck(string) {

    const arr = string.split('');                // str to arr
    const reverseArr = arr.reverse();           //rev arr 
    const reverseStr = reverseArr.join('');    // arr to str

    if(string == reverseStr) {
        document.write( string + '  is a palindrome');
    }
    else {
        document.write(string + ' is not a palindrome');
    }
}

const string = prompt('Enter a string: ');
palindromeCheck(string);