function clear(n,i){

    let mask = -1<<i;
    n = n&mask;

    return n;
}

console.log(clear(15,2))