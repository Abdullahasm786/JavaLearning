class Student {
    public int roll;
    public String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
    void print(){
        System.out.println("Name:"+name);
        System.out.println("Rollno:"+roll);
        System.out.println("___________________________________");
    }

}
public class Arrayofobject {
    public static void main(String args[]){
        Student o=new Student(10,"kavin");
        o.print();
        Student[] o1=new Student[3];
        o1[0]=new Student(10,"raju");
        o1[1]=new Student(10,"ravi");
        o1[2]=new Student(10,"vishnu");
        for(int i=0;i<o1.length;i++){
            o1[i].print();
        }

    }
}
