import java.util.Scanner;

public class TravelCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give distance: ");
        double distance = sc.nextDouble();
        System.out.println("Give time: ");
        double time = sc.nextDouble();
        System.out.println("The speed: " + calSpeed(distance, time));
    }
    public static double calSpeed(double distance, double time) {
        return distance / time;

    }
}


