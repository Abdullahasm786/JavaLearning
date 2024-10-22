import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      int a,b,c,ch;
        System.out.println("1.ADD:");
        System.out.println("2.SUB:");
        System.out.println("3.MUL:");
        System.out.println("4.DIV:");
        System.out.println("enter the choice:");
        Scanner in=new Scanner(System.in);
        ch=in.nextInt();
        System.out.println("enter 2 nos:");
        a= in.nextInt();
        b=in.nextInt();

        switch(ch){
            case 1:
                c=a+b;
                System.out.println("add"+c);
                break;
                case 2:
                    c=a-b;
                System.out.println("sub"+c);
                break;
                case 3:
                    c=a*b;
                System.out.println("mul"+c);
                break;
                case 4:
                    c=a/b;
                System.out.println("div"+c);
                break;
            default:
                System.out.println("Invalid");
                break;
        }

         }
}