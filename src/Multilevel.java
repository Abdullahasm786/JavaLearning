class GrandFather{
    public void house(){
        System.out.println("own a 5bhk house");
    }
}
class Father extends GrandFather{
    public void land(){
        System.out.println("own a 5 Acer of land    ");
    }
}
class son extends Father{
    public void car()
    {
        System.out.println("own a Audi car");
    }
}
public class Multilevel {
    public static void main(String args[]){
        son o=new son();
        o.car();
        o.house();
        o.land();

    }
}
