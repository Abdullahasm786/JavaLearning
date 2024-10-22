import java.util.Scanner;

public class Amstro {
    public static void main(String args[]){
        //Scanner in=new Scanner(System.in);
        int dig1,dig2,dig3,temp,res;
        for(int num=99;num<=999;num++){
            temp=num;
            dig3=temp%10;
            temp=temp/10;
            dig2=temp%10;
            temp=temp/10;
            dig1=temp%10;
            res=(dig1*dig1*dig1)+(dig2*dig2*dig2)+(dig3*dig3*dig3);
            if(num==res){
                System.out.println(num);
            }
        }

    }
}
