public class Mathoperation {
    public static  int multiply(int a, int b){
        return a*b;
    }
    {
        public static  double  multiply(double i, double j){
        return i*j;
    }
}
class Methodoverloading{
    public static void main(String args[]){
        System.out.println(Mathoperation.multiply(20,30));
        //System.out.println(Mathoperation.multiply(2.4,7.0));
    }
}