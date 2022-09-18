function countBits(n){

    let count = 0;

    while(n>0){
        
        let last_bit = (n&1);
        count  = count+last_bit;
        n = n>>1;
    }
    console.log(count)
}

countBits(-1)