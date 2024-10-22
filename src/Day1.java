import java.util.Scanner;
class Day1{
    public static void main(String args[]){
        System.out.println("HELLO");
        //command line 
        /*
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        } */
       //variable 
       /*
       String name="ALLAH";
       int  num=1000;
       float A=10.25f;
       char gender='m';
       boolean married=false;
       System.out.println("NAME:"+name);
       System.out.println("num:"+num);
       System.out.println(A);
       System.out.println(gender);
       System.out.println(married); */
       //TYpe casting 
       /*int a=10;
       double b=a,d=20.55;
       int c=(int)d;
       System.out.println(a);
       System.out.println(b);
       System.out.println(d);
       System.out.println(c);*/
      // int a=10,b=20;
       //System.out.println(a+b);
      /*  int m1=90,m2=20;
       System.out.println("and="+(m1>=35 && m2>=35)); 
       int a=25,b=300,c;
       c=a>b?a:b;//ter4nary 
       System.out.println(c);
       int inc=10;
       inc++;
       System.out.println(inc);
       System.out.println(inc++);
       System.out.println(inc);
       //bit wise
       int o=10,e=11;
       System.out.println(0&e);
       System.out.println(a|b);
       System.out.println(a^b);
       System.out.println(~o);*/
       //importing Scanner 
       /*Scanner in=new Scanner(System.in);
       int a,b,c;
       a=in.nextInt();
       b=in.nextInt();
       c=(a*a)+(b*b)+(2*a*b);
       System.out.println(c);*/
       //election
       /*
       int age;
       System.out.println("enter the age:");
       Scanner in=new Scanner(System.in);
       age=in.nextInt();
       if(age>=18){
        System.out.println("eligible");
       }
       else{
        System.out.println("NOT");
       } */
        //Leap year
        /*int Year;
        System.out.print("enter year:");
        Scanner in=new Scanner(System.in);
        Year=in.nextInt();
        if(Year%4==0)
        {
            System.out.println("Leap year");
        }
        else{
            System.out.println("NOT year");
        }*/
        //Grade 90-100 A,80-90 b,70-80 c,60-70 D,60-50 E=00
        float avg;
        Scanner in=new Scanner(System.in);
        System.out.println("AVG=");
        avg=in.nextFloat();
        if(avg>=90 && avg<=100){
            System.out.println("Grade A");
        }
        else if(avg>=80 && avg<=89){
            System.out.println("GRADE B");
        }
        else if(avg>=70 && avg<=79){
            System.out.println("GRADE c");
        }else if(avg>=60 && avg<=69){
            System.out.println("GRADE d");
        }

    }
}