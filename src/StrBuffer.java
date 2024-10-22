public class StrBuffer {
    public static void main(String args[]){
        StringBuffer buffer=new StringBuffer("Allah");
        buffer.append(" Alam");
        System.out.println(" "+buffer);
        buffer.insert(9," Arrahim");
        System.out.println(buffer);
        buffer.replace(9,12,"***");
        System.out.println(buffer);
        buffer.delete(9,12);
        System.out.println(buffer);
        buffer.reverse();
        System.out.println(buffer);
        System.out.println(buffer.charAt(0));
        System.out.println(buffer.length());
        buffer.reverse();
        System.out.println(buffer.substring(8));
        System.out.println(buffer.substring(4,9));
        buffer.setCharAt(0,'#');
        System.out.println(buffer);//3.42.05
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("hello");
        System.out.println(sb.capacity());



    }
}
