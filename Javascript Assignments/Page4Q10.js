var year = 2022;

var cnt=0;

while(cnt<20){

    if((year%4==0 && year%100!==0)||(year%400==0)){

        document.write("  "+ year + "  ");

        cnt+=1;
    }
    year+=1;
}