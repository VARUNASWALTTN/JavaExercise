import java.util.*;

public class Ques2 {
    public static void main(String[] args) {
        String s="";
        while(true){
            String temp;
            Scanner sc = new Scanner(System.in);
            temp = sc.nextLine();
//            System.out.println(temp);
            String exit = "XDONE";
            if(temp.equals(exit))
                break;
            s+=temp+" ";
        }
        System.out.print(s);
    }
}