import java.util.Scanner;

public class Decimal2binary {
        public static void Decimalbinary(int n){
            int [] binary=new int[100];
            int i=0;
            while(n>0){
                binary[i]=n%2;
                n=n/2;
                i++;    
            }
            for(int j=i-1;j>=0;j--)
                System.out.print(binary[j]+" ");
        }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n= in.nextInt();
        System.out.println("Dec:"+n);
        System.out.print("binary no: ");
        Decimalbinary(n);
    }
}
