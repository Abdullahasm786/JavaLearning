class Methods{
    public void add(){
        int a=10;
        int b=5;
        System.out.println("addition : " +(a+b));
    }
    public void sub(int x,int y){
        System.out.println("Subtraction : " +(x-y));
    }
    public int mul(){
        int a=10;
        int b=20;
        return a*b;
    }
    public float div(int w, int v){
        return (w/v);
    }
}
public class Funtion {
    public static void main(String args[]){
        Methods o=new Methods();
        o.add();//no return no args
        o.sub(30,15);//no return with args
        System.out.println("Mul: "+o.mul());//retun no arg
        System.out.println("Div: "+o.div(20,2));//retrn with args
    }
}
