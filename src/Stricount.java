public class Stricount {
    public static void main(String args[]){
        StringBuilder a=new StringBuilder("Allah 786 Allah ***");
        System.out.println(a);
        int upper=0,lower=0,space=0,number=0,vowels=0;{
            for(int i=0;i<a.length();i++){
                if (a.charAt(i)>=97 && a.charAt(i)<=122){
                    lower++;
                }
                if (a.charAt(i)>=65 && a.charAt(i)<=90){
                    upper++;
                }
                if(a.charAt(i)==32){
                    space++;
                }
                if (a.charAt(i)>=48 && a.charAt(i)<=57){
                    number++;
                }


            }
            System.out.println(upper);
            System.out.println(lower);
            System.out.println(space);
            System.out.println(number);
            System.out.println(a.length()-(upper+lower+space+number));
        }
    }
}
