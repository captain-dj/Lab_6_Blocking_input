import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user enters price
        System.out.println("Enter F to convert to C: ");
        double celsius = scanner.nextDouble();

         double CtoF = celsius * 9/5 + 32;


        System.out.println("your convershion is: " + CtoF);


        scanner.close();
    }
}