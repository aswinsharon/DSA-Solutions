

#include<iostream>
#include<algorithm>
using namespace std;

int charToDigit(char c){
      
      return c - '0';
}
char digitToChar(int n){

    return n + '0';
}

int main(){

    string n1,n2;
    string result;
    if(n1.length() == 1 && n2.length() == 1){
              
       int output = charToDigit(n1[0])+charToDigit(n2[0]);
       result.push_back(digitToChar(output));
     }
     cout<<result;
}