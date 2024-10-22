public class Ascii {
    public static void main(String args[]){
        /*for(int i=0;i<=137;i++){
            System.out.println(i+" "+(char)i);
        }*/
        String a="Ali Maula";
        String b="ali Maula";
        System.out.println("A:"+a);
        System.out.println("B:"+b);
        System.out.println(a.hashCode());//
        System.out.println(b.hashCode());
        System.out.println("equals :"+a.equals(b));
        System.out.println("Equals: "+a.equalsIgnoreCase(b));
        System.out.println("Length:"+a.length());
        System.out.println("CharAt: "+a.charAt(0));
        System.out.println("UPPER:"+a.toUpperCase());
        System.out.println("Replace:"+a.replace("Ali","Master"));
        System.out.println("contains:"+a.contains("Maula"));
        System.out.println("empty:"+a.isEmpty());
        System.out.println("contains:"+a.contains("Maula"));
        System.out.println("Fiind:"+a.startsWith("A"));
        System.out.println("Find"+a.endsWith("a"));
        System.out.println("SubString:"+a.substring(4));
        System.out.println("substring:"+a.substring(0,5));
        char[] charray=a.toCharArray();//charcter array
        for(char c:charray){
            System.out.println(c);
        }
        String c=" Allah ";
        System.out.println("c length:"+c.length());
        System.out.println("c trim:"+c.trim());
        System.out.println("c trim len:"+c.trim().length());
    }
}
