import java.util.Scanner;
public class Amsrtong {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int temp=n;
        int dig1,dig2,dig3;
        dig3=temp%10;
        temp=temp/10;
        dig2=temp%10;
        temp=temp/10;
        dig1=temp%10;
        int result=(dig1*dig1*dig1)+(dig2*dig2*dig2)+(dig3*dig3*dig3);
        //System.out.println(result);
        if(n==result){
            System.out.println("amstrong");
        }
        else {
            System.out.println("NOt");
        }
    }
}
