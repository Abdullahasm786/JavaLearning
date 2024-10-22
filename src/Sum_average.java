import java.util.Scanner;

public class Sum_average {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the limit: ");
        int n=in.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            //System.out.println();
            int a=in.nextInt();
            sum+=a;
        }
        System.out.println(sum);
        System.out.println(sum/n);
    }
}





