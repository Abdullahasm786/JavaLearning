import java.util.Scanner;

public class Whileloop {
public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("no:");
    int n=in.nextInt();
    int i=2;
    do{
        System.out.println(i);
        i=i+2;
    }
    while(i<=n);
}
}
