class complex{
    private int real,img;
    public complex(){
        this.real=5;
        this.img=4;
    }
    public complex(int r,int i){
        this.real=r;
        this.img=i;
    }
    public complex(complex o2){

    }
    public String toString(){
        return"("+real+"+"+img+"i)";
    }
}
public class Copycons {
    public static void main(String args[]){
        complex o=new complex();
        System.out.println("object : "+o);
        complex o2=new complex(20, 10);
        System.out.println("object : "+o2);
    }
}
