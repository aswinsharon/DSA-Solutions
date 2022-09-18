//given 2N+1 numbers where every number comes twice
//except one number.Find out that number
public class unique1 {
     
    static void findUnique(int [] arr){
        
        int xored = 0;
        for(int i = 0;i < arr.length;i++){
         
            xored = xored^arr[i];
            
        }
        System.out.println(xored);

    }
    public static void main(String[] args) {

        int [] arr = {1,10,3,1,10};
        
        findUnique(arr);
    }
    
}