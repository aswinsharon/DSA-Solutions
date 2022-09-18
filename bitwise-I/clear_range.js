function clear_range(n,i,j){
    
    let a = (~0)<<(j+1);    //10000
    let b = (1<<i)-1; //(2 power n)-1 --> 00001
    let mask = a|b

    n = n&mask;

    console.log(n)
}

clear_range(31,1,3);

