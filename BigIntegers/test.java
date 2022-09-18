import java.util.Scanner;

public class test{
   
    static int charToInteger(char c){

        return c - '0';
    }

    static int integerToChar(int n){

        return n + '0';
    }
    
    static String reverse(String s){
        
        String output = " ";

        for(int i = s.length()-1;i >= 0 ;i--){
            
            output += s.charAt(i);
        }
        return output;
    }

    static String bigIntegerAddition(String s1,String s2){

        String n1 = reverse(s1);
        String n2 = reverse(s2);

        int carry = 0;
        String result = " ";

        if(n1.length() > n2.length()){
           
            String temp = n1;
            n1 = n2;
            n2 = temp;
        }

        for(int i = 0;i < n1.length();i++){

          int d1 = charToInteger(n1.charAt(i));
          int d2 = charToInteger(n2.charAt(i));
          int sum = d1+d2+carry;

          int output_digit = sum%10;
          carry = sum/10;
          
          result += integerToChar(output_digit);
        }

        for(int i = n1.length();i < n2.length();i++){
           
            int d1 = charToInteger(n1.charAt(i));
            int sum = d1+carry;
            int output_digit = sum%10;
            carry = sum/10;

            result += integerToChar(output_digit);
        }

        if(carry != 0){

            result += integerToChar(carry);
        }
        
        String final_result = reverse(result);

        return final_result;
    }
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(bigIntegerAddition(s1,s2));
        sc.close();
    }
}

