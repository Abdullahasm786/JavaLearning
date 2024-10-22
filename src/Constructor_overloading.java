class Box{
        float length,width;
        Box(){// default
            length=3;
            width=10;
        }public Box(float x,float y){
            length=x;
            width=y;
    }
    Box(float x){
            length=width=x;
    }
    float area(){
            return width*length;
    }

}
public class Constructor_overloading {
    public static void main(String args[]){
        Box o=new Box();
        System.out.println(o.area());
        Box o1=new Box(10,20);
        System.out.println(o1.area());
        Box o2=new Box(10);
        System.out.println(o2.area());
    }
}
