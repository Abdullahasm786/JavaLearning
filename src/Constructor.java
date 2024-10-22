class RectangleShape{
    int width,length;
    RectangleShape(){
        System.out.println("Constructor>>>>>>>>>>>>>>");
        length=2;
        width=20;

    }
    int area(){
        int a=width*length;
        return a;

    }
}
public class Constructor {
    public static void main(String args[]){
        RectangleShape o=new RectangleShape();
        System.out.println(o.area());


    }
}
