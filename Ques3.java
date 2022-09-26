import java.util.*;

public class Ques3{
    public static void main(String[] args){
//        calculate cal = new calculate();
        Double r,a,cir;
        int c;
        Scanner sc = new Scanner(System.in);
        r = sc.nextDouble();
        while(true) {
            c = sc.nextInt();
            switch (c) {
                case 1:
                    a = area(r);
                    System.out.println("Area : " + a);
                    break;
                case 2:
                    cir = circumference(r);
                    System.out.println("Circumference : " + cir);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
    static Double area(Double r){
        return 3.14*r*r;
    }
    static Double circumference(Double r){
        return 2*3.14*r;
    }
}