class React{
   private int length,width;
   int getLength(){
    return length;
   }
   void setLength(int l){
       if(l>0)
       length=l;
       else
           length=0;
   }
   int getWidth(){
       return width;
    }
    void setWidth(int w){
       if(w>0)
       width=w;
       else
           width=0;
    }
    int area(){
        int a=length*width;
        return a;
    }
}
public class GetterSetter {
    public static void main(String args[]){
        React o=new React();
        o.setLength(100);
        o.setWidth(20);
        System.out.println(o.getLength());
        System.out.println("Area b2: "+o.area());


    }
}
