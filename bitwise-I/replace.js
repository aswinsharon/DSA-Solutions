/*you are given a two 32-bit numbers, N and M and two bit positions i and j. write a method to set
all bits between i and j in N equal to M.M(becomes a substring of N locationed at and starting at j)*/

/*example:
N = 10000000000
M = 10101;
i = 2,j = 6
output = 1001010100 */

function clearBitsInRange(N,i,j){

    let a = (~0)<<(j+1);
    let b = (1<<i)-1;
    let mask = a|b;
    N = N&mask;
    return N;
}

function replaceBits(N,M,i,j){
    
    N = clearBitsInRange(N,i,j);
    let mask = (M<<i);
    let output = (N|mask);
    return output;
    
}

function main(){

    let N = 15;
    let M = 2;
    let i = 1;
    let j = 3;

    let output = replaceBits(N,M,i,j)
    console.log(output)
}

main()