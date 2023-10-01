import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user enters Sides
        System.out.println("Enter hight: ");
        double hight = scanner.nextDouble();

        System.out.println("Enter width: ");
        double width = scanner.nextDouble();

        double area = hight * width;
        double pie = hight + width;

        System.out.println("your area is: " + area);
        System.out.println("your perimiter is: " + pie);

        scanner.close();
    }
}