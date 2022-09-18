#include <algorithm>
#include <iostream>
#include <string.h>

int charToDigit(char c){
      
      return c - '0';
}
char digitToChar(int n){

    return n + '0';
}

std::string addNumbers(std::string n1,std::string n2){
    
    if(n1.length() > n2.length()){
       
       swap(n1,n2);
    }

    reverse(n1.begin(),n1.end());
    reverse(n2.begin(),n2.end());

    std::string result = "";
    int carry = 0;

    if(n1.length() == 1 && n2.length() == 1){
              
       int output = charToDigit(n1[0])+charToDigit(n2[0]);
       result.push_back(digitToChar(output));
       
       return result;
     }

    for(int i = 0; i < n1.length();i++){

        char d1 = charToDigit(n1[i]);
        char d2 = charToDigit(n2[i]);
        
        int sum = d1+d2+carry;
        int output_digit = sum%10;
        carry = sum/10;

        result.push_back(digitToChar(output_digit));
    }

    for(int i = n1.length();i < n2.length();i++){

        char d1 = charToDigit(n2[i]);

        int sum = d1+carry;
        int output_digit = sum%10;
        carry = sum/10;

        result.push_back(digitToChar(output_digit));

    }   
    if(carry){

        result.push_back(carry);
    }
    
    reverse(result.begin(),result.end());
    return result;
}
int main(){

    std::string s1,s2;

    std::cin>>s1;
    std::cin>>s2;

    std::cout<<addNumbers(s1,s2)<<std::endl;

}