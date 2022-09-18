import java.util.Scanner;
public class hammingDistance {
    
    static void hamming_Distance(int x,int y){
       
        int val = x^y;
        int ans = 0;
        while(val > 0){
         
            val = val&(val-1);
            ans++;

        }
        System.out.println(ans);
        // int ans = 0;
        // while(x > 0 || y > 0){

        //     int last1 = x&1;
        //     int last2 = y&1;

        //     if(last1 != last2){
        //         ans++;
        //     }
        //     x = x >> 1;
        //     y = y >> 1;
        // }
        // System.out.println(ans);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first input:");
        int x = sc.nextInt();
        System.out.print("Enter second input:");
        int y = sc.nextInt();

        hamming_Distance(x, y);

        sc.close();
    }
}
