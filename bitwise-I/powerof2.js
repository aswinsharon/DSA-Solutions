function powerofTwo(n){

    if((n & (n-1)) == 0){
        console.log("power of two");
    }
    else{
        console.log("not a power of two");
    }
}
powerofTwo(0)