import java.util.Scanner; //set bits --> number of 1's
class count_bits{
    
    static void count_bit2(int n){

        int count = 0;

        while(n>0){
            n = n&(n-1);
            count++;
        }
        System.out.println(count);
    }
    static void count_bit(int n){

        int count = 0;

        while(n>0){
         
            int last = n&1;
            count = count+last;
            n = n>>1;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        count_bit2(n);
        count_bit(n);
        sc.close();

    }
}