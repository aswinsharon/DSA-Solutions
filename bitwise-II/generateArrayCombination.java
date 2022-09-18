public class generateArrayCombination {
    
    static void combination(int []arr,int number){
      
        while(number > 0){
            
            int last = number&1;

            if(last == 1){

             System.out.println();
            }
        }
        

    }

    static int factorial(int n){
       
        int fact = 1;
                                                    //generate the factorial for n
        for(int i = 1;i<=n;i++){                    // pick elements which are not divisble by 2

            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        
        int [] arr = {4,14,2};
        int n = arr.length;

        for(int i = 0;i<(factorial(n));i++){

        }

    }
}
