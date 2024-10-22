import java.util.Arrays;
import java.util.Scanner;

public class Arrayreturn {
    public static int[]sortArray(){
        //return new int[]{1,2,3};
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []a=new int[n];
        for(int i=0;i>n;i++){
            System.out.println("Enter the value "+i+": ");
            a[i]= in.nextInt();
        }
        Arrays.sort(a);
        return a;
    }
    public static void main(String args[]){
        int arr[] = sortArray();
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
