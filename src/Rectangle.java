class Area{
    int length,width;
    void getdetails(int x,int y){
        length=x;
        width=y;
    }
    int area(){
        int a=length*width;
        return a;
    }
}
public class Rectangle {
    public static void main(String args[]){
        Area o=new Area();
        o.length=10;
        o.width=20;
        System.out.println("Area:"+o.area());
        Area o2=new Area();
        o2.getdetails(10,2);
        System.out.println("Area b2: "+o2.area());

    }
}
