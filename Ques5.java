import java.util.*;

class Employee{
    String first_name,last_name,designation;
    int age;
    public Employee(){
        first_name = "Manvendra";
        last_name = "Pratap Singh";
        designation = "Software-Engineer-QE";
        age = 23;
    }
    public Employee(String f,String l,String d,int a){
        this.first_name = f;
        this.last_name = l;
        this.designation = d;
        this.age = a;
    }
    public Employee(Employee emp){
        this.first_name = emp.first_name;
        this.last_name = emp.last_name;
        this.designation = emp.designation;
        this.age = emp.age;
    }
    void setName(String f,String l){
        this.first_name = f;
        this.last_name = l;
    }

    String getName(){
        return first_name+" "+last_name;
    }
    void setDesignation(String d){
        this.designation = d;
    }
    String getDesignation(){
        return designation;
    }

    void setAge(int a){
        this.age = a;
    }
    int getAge(){
        return age;
    }

    public String toString(){
        return "This is "+first_name+" "+last_name+".I am working as "+designation+
                ". And my age is "+age+".";
    }


}
public class Ques5{
    public static void main(String[] args){
        Employee e1 = new Employee();
//        System.out.println("This is "+e1.getName()+".I am working as "+e1.getDesignation()+
//                ". And my age is "+e1.getAge()+".");
        Employee e2 = new Employee("Shivam","Kumar","Software-Engineer-AEM",22);
//        System.out.println("This is "+e2.getName()+".I am working as "+e2.getDesignation()+
//                ". And my age is "+e2.getAge()+".");
        Employee e3 = new Employee(e2);
//        System.out.println("This is "+e3.getName()+".I am working as "+e3.getDesignation()+
//                ". And my age is "+e3.getAge()+".");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
//        System.out.println(e.getName());
//        e.setName("Shubham","Kumar");
//        System.out.println(e.getName());
//        System.out.println(e.getDesignation());
//        e.setDesignation("SE");
//        System.out.println(e.getDesignation());
//        System.out.println(e.getAge());
//        e.setAge(23);
//        System.out.println(e.getName());

    }
}


