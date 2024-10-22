import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Table: ");
        int t = in.nextInt();
        System.out.print("Starting limit: ");
        int start = in.nextInt();
        System.out.print("End: ");
        int end = in.nextInt();
        for (int i = start; i <= end; i++) {
            System.out.println(i + " x " + t + " = " + (t * i));
        }
        in.close();
    }
}
