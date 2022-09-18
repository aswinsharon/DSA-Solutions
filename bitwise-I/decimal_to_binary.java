import java.util.Scanner;

class decimal_to_binary{
   
    static void deciToBinary(int n){

        int ans = 0;
        int power = 1;

        while(n > 0){
          
            int last_bit = n&1;
            ans += last_bit*power;
            power = power*10;
            n = n>>1;
        }
        System.out.println(ans);

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        deciToBinary(n);
        sc.close();
    }
}
