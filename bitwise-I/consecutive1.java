public class consecutive1 {

    static void consecutive(int n){
        
        int cnt = 0;
        int val = 0;
        while(n > 0){
           
         val = n << 1;
         n = n&val;
         cnt++;

        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        
      int n = 7;

      consecutive(n);
    }
}
