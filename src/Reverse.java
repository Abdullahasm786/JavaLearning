import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
        System.out.print("status:");
        char marr=in.next().charAt(0);
        if(marr=='u' || marr=='U'){/////doubt
            System.out.print("Gender:");
            char gen=in.next().charAt(0);
            System.out.print("age:");
            int age= in.nextInt();
            if((gen=='M' || gen=='m')&&age>=30){
                System.out.println("eligible.");
            } else if ((gen=='G'|| gen=='g')&&age>=25) {
                System.out.println("eligible");
            }
            else{
                System.out.println("NOT");
            }
        } else if (marr=='m' || marr=='M') {
            System.out.println("eligible.");
            
        }
        else{
            System.out.println("enter validop");
        }
    }
}
