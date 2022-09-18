//unique numeber - Given 2N+2 Numbers, where every number is coming twice except
//two numbers find those two unique numbers
public class unique2{
    

    static void uniqueElements(int [] arr){
     
        int result = 0;
        for(int i = 0;i < arr.length;i++){
             
            result = result^arr[i];
        }
        
        int temp = result;
        int pos = 0;

        while((temp&1) == 0){

            pos++;
            temp = temp >> 1;
        }
        
        int mask = 1<<pos;
        int setA = 0;
        int setB = 0;
        for(int i = 0;i< arr.length;i++){
          
            if((arr[i]&mask) == 1){

                setA = setA^arr[i];
            }

            else{
                setB = setB^arr[i];
            }
        }

        System.out.println(setA);
        System.out.println(setB);
    


    }
    public static void main(String[] args) {
        
       int [] arr = {1,3,5,2,3,1,5,9};
      
        uniqueElements(arr);
        
    }
}