public class Duplicate {
    public static void main(String args[]){
        int a[]={1,2,4,4,5,5,6,3};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length-1;j++){
                if((a[i]==a[j])&&(i!=j)){
                    System.out.println(a[j]);
                }
            }
        }
    }
}
