class Shapes{
    float length,breath,radius;
}
class rect extends Shapes{
    public rect(float l,float b){
        length=l;
        breath=b;
    }
    float rectangle_area(){
        return length* breath;
    }
}
class Cir extends Shapes{
    public Cir(float r)
    {
        radius=r;
    }
    float cir_area(){
        return 3.14f*(radius*radius);
    }
}
class Sqr extends Shapes{
    public Sqr (float l){
        length=l;
    }
    float Sqr_area(){
        return (length*breath);
    }
}
public class Hireracial {
    public static void main(String args[]){
        rect o1=new rect(2,3);
        System.out.println(o1.rectangle_area());
        Sqr o2=new Sqr(3);
        System.out.println(o2.Sqr_area());
        Cir o3=new Cir(5);
        System.out.println(o3.cir_area());


    }
}
