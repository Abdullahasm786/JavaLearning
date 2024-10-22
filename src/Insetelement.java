import java.util.Arrays;

public class Insetelement {
    public static void main(String args[]){
        int a[]={1,2,4,5,6,7,8,9};
        int index=2;
        int value=3;
        System.out.println("Before: "+Arrays.toString(a));
        for(int i=a.length-1;i>index;i--){
            a[i]=a[i-1];
        }
        a[index]=value;
        System.out.println("After: "+Arrays.toString(a));
    }
}
