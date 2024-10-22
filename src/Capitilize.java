public class Capitilize {
    public static void main(String args[]){
        StringBuilder a=new StringBuilder("abdullah");
        System.out.println(a);
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>=97 && a.charAt(i)<=122){
                int c=(int)a.charAt(i)+32;
                a.setCharAt(i,(char)c);
            }else if(a.charAt(i)>=65 && a.charAt(i)<=90)
            {
                int c=(int) a.charAt(i)-32;
                a.setCharAt(i,(char) c);
            }

        }
        System.out.println("ans: "+a);
    }
}
