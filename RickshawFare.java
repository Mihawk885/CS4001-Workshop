import java.util.Scanner;
public class RickshawFare{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        //taking input
        System.out.print("Enter distance in km: ");
        double distance = sc.nextDouble();
        
        System.out.print("Enter time in minutes: ");
        int time = sc.nextInt();
        
        System.out.print("Is the customer a local? (yes/no): ");
        boolean local =sc.next().equalsIgnoreCase("yes");
        
        System.out.print("Is it night travel? (yes/no): ");
        boolean night =sc.next().equalsIgnoreCase("yes");
        
        double fare = 50 + distance * 20 + time * 2;

        
         if (local && distance > 10) fare *= 0.9;   // 10% discount
        if (night) fare *= 1.2;                    // 20% extra

        System.out.println("Final Fare: Rs. " + (int)fare);
    }
}