import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int revnum=0;

        while(n>0){
            int num=n%10;
            revnum=revnum*10+num;
            n=n/10;
        }
        if(original==revnum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
