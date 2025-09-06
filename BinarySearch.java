import java.util.*;
public class Binarysearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
     
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

         System.out.print("Enter the Target value: ");
        int target=sc.nextInt();

        int result=binarysearch(arr,target);

        if(result==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at the index: "+result);
        }
    }
    public static int binarysearch(int[] arr,int target){
        int left=0,right=arr.length-1;

        while(left<=right){
        int mid=(left+right)/2;

        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]<target){
            left=mid+1;
        }
        else{
            right=mid-1;
        }
    }
    return -1;  
    }  
}
