public class minmax {

    public static void main(String[] args) {
         int[] arr={10,50,12,46,18,22};
         System.out.println(secondlargestelement(arr));
    }


    private static int secondlargestelement(int[] arr){
        int max=0;
        int secondmax=0;

        for(int num : arr){
            if(max< num){
                secondmax=max;
                max=num;
            }
            else if(secondmax<num){
                secondmax=num;
            }
        }
        return secondmax;
    }
    
}
