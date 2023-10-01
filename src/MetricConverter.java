import java.util.Scanner;
public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user enters Sides
        System.out.println("Enter meters: ");
        double meter = scanner.nextDouble();

        double inches = meter * 39.3700787;
        double Feet = meter * 3.2808399;
        double miles = meter / 1609.344;
        System.out.println("The inches is: " + inches);
        System.out.println("The feet is: " + Feet);
        System.out.println("The mile is: " + miles);

        scanner.close();
    }
}
