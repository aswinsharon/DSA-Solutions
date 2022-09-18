import java.util.Scanner;

public class bigIntegerAdd{
   
    static int charToInteger(char c){

        return c - '0';
    }

    static int integerToChar(int n){

        return n + '0';
    }
    

    static StringBuffer bigIntegerAddition(String s1,String s2){

        StringBuffer n1 = new StringBuffer(s1);
        StringBuffer n2 = new StringBuffer(s2);

        n1.reverse();
        n2.reverse();

        int carry = 0;
        StringBuffer result = new StringBuffer();

        if(n1.length() > n2.length()){
           
            StringBuffer temp = n1;
            n1 = n2;
            n2 = temp;
        }

        for(int i = 0;i < n1.length();i++){

          int d1 = charToInteger(n1.charAt(i));
          int d2 = charToInteger(n2.charAt(i));
          int sum = d1+d2+carry;

          int output_digit = sum%10;
          carry = sum/10;
          
          result.append(integerToChar(output_digit));
        }

        for(int i = n1.length();i < n2.length();i++){
           
            int d1 = charToInteger(n1.charAt(i));
            int sum = d1+carry;
            int output_digit = sum%10;
            carry = sum/10;

            result.append(integerToChar(output_digit));
        }

        if(carry != 0){

            result.append(integerToChar(carry));
        }
        
        result.reverse();
        return result;
    }
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(bigIntegerAddition(s1,s2));
        sc.close();
    }
}