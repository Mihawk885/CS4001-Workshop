import java.util.Scanner;
public class GradeEvalutor{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the grade");
        double grade=sc.nextDouble();
        String store=(grade >=40 ) ? "Pass" : "fail";
        System.out.println(store);
    }
}