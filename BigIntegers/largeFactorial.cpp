#include <iostream>
#include <vector>
#include <algorithm>

using std::vector;
using std::cout;
using std::cin;
using std::endl;

void multiply(vector<int>&a,int &size,int num){
    
  int carry = 0;
  for(int i = 0;i<size;i++){
     
     int product = a[i]*num+carry;
     a[i]  = product%10;
     carry = product/10;
  }

  while(carry){
   
    a[size] = carry%10;
    carry = carry/10;
    size = size+1;  
  }   
}


void bigFactorial(int n){
   
  vector<int>a(1000,0);
  a[0] = 1;
  int size = 1;

  for(int i = 2;i<=n;i++){
    
    multiply(a,size,i);
  }

  for(int i = size-1; i>=0;i--){
    
        cout<<a[i];
   }
   cout<<endl;
}

int main(){

    int n;
    cin>>n;

    bigFactorial(n);
}
