function set_ith_bit(n,i){

    let mask = (1<<i);
     n = n|mask;

    return n;
}

console.log(set_ith_bit(5,0))