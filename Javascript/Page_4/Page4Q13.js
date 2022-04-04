

function checkElement(ele){

    var list = [32,54,78,90,43,56,"hello",'world'];
    var flag = 0;
    

    for(var i=0; i<list.length; i++) {
        if(ele == list[i])
            flag = 1;
    }
    
    if(flag == 1)
        document.write('Element Found');
    else
        document.write('Element Not Found');

}

var ele = prompt("enter the element to search : ");
checkElement(ele);