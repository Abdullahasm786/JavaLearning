class Demo{
    private int m,n;
    Demo(int x,int y){
        m=x;
        n=y;
    }
    int largest(){
        if(m>n)
            return m;
        else
            return n;
    }
    void dislay(){
        int largest=largest();
        System.out.println("ANS: "+largest);
    }
}
public class Nesting_method {
    public static void main(String args[]){
        Demo o=new Demo(10,20);
        o.dislay();
    }
}
