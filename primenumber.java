import java.util.*;
public class Primenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("The given number is: ");
        int number=sc.nextInt();
        int count=0;

        for(int i=1;i<=number;i++){
            if(number%i==0){
                count++;
            }
        }
            if(count==2){
                System.out.println("The given number is Prime");
            }
            else{
                System.out.println("The given number is not a prime");
            }
        }   
    }
