import java.util.Scanner;
public class Perfectsquare {
    public static void main(String args[]){
         Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         int sum=0;
         for(int i=1;i<n;i++){
             if(n%i==0) {
                 sum += i;
             }
         }
         if(sum==n){
             System.out.println(n+":is perfect");
         }
         else {
             System.out.println("not perfect");
         }
    }
}
