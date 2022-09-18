class sort_by_numberOf1{

    static int count_bit(int n){
        int count = 0;

        while(n > 0){
         
            int last_bit = n&1;
            count += last_bit;
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        
        int [] arr = {258,520,518,322,88,658,688,480,216,433,186,818,685,315,963,506,767};
         //int [] arr = {1, 2, 3, 4, 5, 6};
        for(int i = 0;i<arr.length-1;i++){
         
            for(int j = 0;j<arr.length-1-i;j++){

                if(count_bit(arr[j]) > count_bit(arr[j+1])){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

                if(count_bit(arr[j]) == count_bit(arr[j+1])){
                    
                    if(arr[j] > arr[j+1]){
                        
                        int temp1 = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp1;
                    }
                }
            }
        }

       for(int elem : arr){

        System.out.print(elem+" ");

       }
    }
}