import java.util.Scanner;

public class WaterLevelMonitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double waterLevel = sc.nextInt();
        System.out.println("Current Water Level: " + waterLevel + "L");
        String status = (waterLevel >= 1000) ? "WARNING: Water level has reached 1000L or more!": "Status: Normal.";
        System.out.println(status);
    }
}