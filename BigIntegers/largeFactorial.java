
import java.util.Scanner;
import java.util.ArrayList;

public class largeFactorial{
    
    static void multiply(ArrayList<Integer> arr,int no,int size){
        
        int carry = 0;

        for(int i = 0; i < size;i++){

            int product = arr.get(i) * no + carry;
            arr.add(i,product%10);
            carry = product/10;

        }
        while(carry > 0){

            arr.add(size,carry%10);
            carry = carry/10;
            size++;
        }
    }

    static void bigFactorial(int n){
       
        ArrayList<Integer>arr = new ArrayList<Integer>(1000);
    
        arr.add(0,1);
        int size = 1;

        for(int i = 2;i<=n;i++){

            multiply(arr,i,size);
        }
        
        for(int i = arr.size()-1;i >= 0;i--){

            System.out.print(arr.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        bigFactorial(n);
    }
}