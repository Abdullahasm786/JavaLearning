import java.util.Scanner;

public class Array {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
       // int c[];
        int a[]={10,2,3,4};
        //System.out.println(a[2]);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        for(int element:a){
            System.out.println(element);
        }
        int b[]=new int[5];
        int c[]=new int[10];
        for (int element: b){
            System.out.println(element);
        }
        for (int i=0;i<9;i++){
            System.out.println("number:");
            c[i]=in.nextInt();
        }
        for (int element:c){
            System.out.println(element);
        }
    }
}
