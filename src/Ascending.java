import java.util.Arrays;
public class Ascending {
    public static void main(String args[]){
        int a[]={23,44,66,100,3,47,9,100};
        int temp;
       /* System.out.println("beforsort:");
        for(int element:a){
            System.out.print (element+",");
        }*/
        System.out.println("beforesort:"+Arrays.toString(a));// single line codefor printing array
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }System.out.println("aftersort:"+Arrays.toString(a));
    }
}
