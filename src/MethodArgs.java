public class MethodArgs {
    public static void getNames(String... names){
        //System.out.println(name[0]);
        for(String name:names)
        System.out.println(name);
    }
    public static void main(String args[]){
        getNames("Kevin","sam","kumar","Mufasa");

    }
}
