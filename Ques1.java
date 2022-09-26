import java.util.*;
class person{
    static String first_name,last_name;
    static int age;
    public person(String f,String l,int a){
        this.first_name = f;
        this.last_name = l;
        this.age = a;
    }
    static{
        System.out.println("This is "+first_name+" "+last_name+". And my age is "+age+".");
    }
    static void func(){
        System.out.println("This is "+first_name+" "+last_name+". And my age is "+age+".");
    }
}
public class Ques1 {
    public static void main(String[] args) {
        person p = new person("Shivam","kumar",22);
        p.func();
        System.out.println("This is "+p.first_name+" "+p.last_name+". And my age is "+p.age+".");
    }
}