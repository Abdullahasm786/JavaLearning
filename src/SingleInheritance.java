class Father{
    public void house(){
        System.out.println("own a 3bhk house");
    }
}
class son extends Father{
    public void car()
    {
        System.out.println("own a Audi car");
    }
}
public class SingleInheritance {
    public static void main(String args[]){
    son o=new son();
    o.car();
    o.house();

    }
}