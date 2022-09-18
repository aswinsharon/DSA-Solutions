/*you are given a two 32-bit numbers, N and M and two bit positions i and j. write a method to set
all bits between i and j in N equal to M.M(becomes a substring of N locationed at and starting at j)*/

/*example:
N = 10000000000
M = 10101;
i = 2,j = 6
output = 1001010100 */


#include<iostream>

void clearBitInRange(int &N,int i,int j){

    int a = (~0)<<(j+1);
    int b = (1<<i)-1;
    int mask = a|b;
    N = N & mask;
}
void replaceBits(int &N,int M,int i,int j){

    clearBitInRange(N,i,j);
    int mask = (M<<i);
    N = N|mask;

}
int main(){

    int N = 15;
    int i = 1;
    int j = 3;
    int M =2;
    replaceBits(N,M,i,j);
    std::cout<<N<<"\n";

    return 0;

}