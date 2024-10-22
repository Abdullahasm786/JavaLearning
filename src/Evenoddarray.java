import java.util.Scanner;

public class Evenoddarray {
    public static void main(String args[]){
        int e=0,o=0;
        Scanner in=new Scanner(System.in);
        System.out.println("limit:");
        int n= in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter a["+i+"]value:");
            a[i]=in.nextInt();
        }
        for(int elemnet:a){
            System.out.println(elemnet);
            if(elemnet%2==0){
                e++;
            }
            else{
                o++;
            }

        }
        System.out.println("even"+e);
        System.out.println("odd"+o);
    }
}
