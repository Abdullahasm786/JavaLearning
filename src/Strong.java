import java.util.Scanner;

public class Strong {
    public static void main(String args[]){
        int orinalnum,rem,fact,sum=0;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the num:");
        int n= in.nextInt();
        orinalnum=n;
        while (n>0){
            rem=n%10;
            //System.out.println(rem);
            fact=1;
            for(int i=1;i<=rem;i++){
                fact*=i;
            }
            //System.out.println(fact);
            sum+=fact;
            n=n/10;
            }
        if(sum==orinalnum){
            System.out.println("strong");
        }
        else {
            System.out.println("not");
        }
    }
}
