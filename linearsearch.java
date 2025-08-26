import java.util.*;
public class linearsearch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Size of the array:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        int target=11;

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        int result=linearsearch(nums,target);

        if(result!=1)
            System.out.println("Element found at the index: " + result);
        
        else
            System.out.println("Element not found");

    }
public static int linearsearch(int[] nums,int target){

    for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            return i;
        }
    }
    return 1;
}
}
