import java.util.Scanner;

public class Rev {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("enter number:");
        int n=in.nextInt();
        int rev=0,rem;
        while(n!=0){
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        System.out.println(rev);

    }
}
