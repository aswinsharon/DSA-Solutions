public class totalHammigDistance {
    
    static int  hammingDistance(int a,int b){
    
        int last1 = 0,last2 = 0;
        int count = 0;
        while(a > 0 || b > 0){
             
             last1 = a & 1;
             last2 = b & 1;
                                          
             if( last1 != last2){
                 
                 count++;
             }
             
             a = a >> 1;
             b = b >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        
        System.out.println(hammingDistance(4, 2));
    }
}

