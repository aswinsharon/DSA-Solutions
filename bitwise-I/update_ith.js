function clear(n,i){

    let mask = ~(1<<i)
    let cleared_bit = n&mask;

    return cleared_bit;
}


function update_ith(n,i,v){
      
    let cleared_bit = clear(n,i);
    let mask = v<<i;
    n = cleared_bit|mask;
    
    console.log(n);

}

update_ith(13,2,0)