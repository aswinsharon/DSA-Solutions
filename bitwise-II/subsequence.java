// for a string of  length n there are (2^N)-1 possible subsequence
//(2 power N)-1 can also be written as (1<<N)-1

import java.util.Scanner;

public class subsequence{
      
    static void overlayNumber(int number,String s){
         
        int j = 0;
        while(number > 0){
                                       //2^(N)-1 complexity
            int last_bit = number&1;
            
            if(last_bit == 1){
               
               System.out.print(s.charAt(j));
            }
            j++;
          
          number = number >> 1;
        }
        System.out.println();
    }


    static void generateAllSubsequence(String s){
      
        int n = s.length();

        for(int i = 0;i < (1<<n);i++){
           
            overlayNumber(i, s);

        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        generateAllSubsequence(s);
        sc.close();
    }
}