function Rotate (arr , n) {  

for(i = 0; i < n; i++){  
        
    var first = arr[0];  
          
        for(var j = 0; j < arr.length-1; j++){  
                 
            arr[j] = arr[j+1];  
        }  

        arr[j] = first;  

    }   

        for(i = 0; i< arr.length; i++){  

            document.write(  arr[i] + " , ");  
        }  
}  

        var arr = [1, 2, 3, 4, 5,6];     
        var n = 2; 

        Rotate(arr,n);


        
    
        