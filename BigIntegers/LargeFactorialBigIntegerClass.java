import java.math.BigInteger;
import java.util.Scanner;

public class LargeFactorialBigIntegerClass {
    
    static BigInteger factorial(int n){

        BigInteger result = BigInteger.ONE;

        for(int i = 2;i <= n;i++){

            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       System.out.println(factorial(n));
        sc.close();
    }
  
}
