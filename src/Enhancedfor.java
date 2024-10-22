public class Enhancedfor {
    public static void main(String args[]){
        int a[][]={
                {10,20,30,40},
                {50,60,70},
                {80,90,11,12}
        };
        for(int elemnt[]:a){
            for(int l:elemnt){
                System.out.print(" "+l);
            }
        System.out.println("");
        }
    }
}
