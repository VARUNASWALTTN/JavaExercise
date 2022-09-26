import java.util.*;

public class Ques4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r,c;
        r = sc.nextInt();
        c = sc.nextInt();
        int arr[][] = new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sum of every row:-");
        for(int i=0;i<r;i++){
            int sumrow = 0;
            for(int j=0;j<c;j++){
                sumrow+=arr[i][j];
            }
            System.out.print(sumrow+" ");
        }
        System.out.println();
        System.out.println("Sum of every column:-");
        for(int i=0;i<c;i++){
            int sumcol = 0;
            for(int j=0;j<r;j++){
                sumcol+=arr[j][i];
            }
            System.out.print(sumcol+" ");
        }

    }
}