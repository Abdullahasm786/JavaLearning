import java.util.Scanner;

public class Primeeeee {
    public static void main(String args[]){
        System.out.println();
        Scanner in=new Scanner(System.in);
        System.out.println("number:");
        int num= in.nextInt();
        int f=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                f++;
            }
        }
        if(f==2){
            System.out.println("prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
