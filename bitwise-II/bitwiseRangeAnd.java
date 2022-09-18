import java.util.Scanner;

public class bitwiseRangeAnd {
    
    static int countBits(int left,int right){
           
        int count = 0;
        
        while(left != right){

            count++;                       //the brute force approach takes O(n-m)
            left = left>>1;                //so we use this approach
            right = right>>1;
        }
        return left<<count;        //0101 
                                   //0110
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();

        System.out.println(countBits(left, right));
        sc.close();
    }
}
