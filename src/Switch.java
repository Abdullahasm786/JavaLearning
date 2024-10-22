import java.util.Scanner;

public class Switch {
    public static void main(String args[]){
    char c;
    Scanner in=new Scanner(System.in);
        System.out.println("alpha:");
    c=in.next().charAt(0);
    switch (c){
        case 'a':
        case 'e':
        case 'i':
        case '0':
        case 'u':
            System.out.println("vowels");
            break;
        default:
            System.out.println("NOT");
    }
}}
