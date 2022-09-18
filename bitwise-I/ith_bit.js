function ith_bit(i,n){
    
    let mask = (1<<i)&n; //left shift to pos i

    if(mask > 0){
        console.log(1);
    }
    else{
        console.log(0);
    }
   
}

function main(){

    let i = 2;
    let n = 12;

    ith_bit(i,n)
}
main()