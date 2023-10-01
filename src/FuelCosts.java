import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double gallonsInTank, fuelEconomy, gasPrice;

        do
        {
            System.out.print("Enter the gallons of gas in the tank: ");

            gallonsInTank = scanner.nextDouble();
        }
        while (gallonsInTank <= 0);

        do
        {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");

            fuelEconomy = scanner.nextDouble();
        }
        while (fuelEconomy <= 0);
        do
        {
            System.out.print("Enter the price of gas per gallon: ");
            gasPrice = scanner.nextDouble();
        }
        while (gasPrice <= 0);
        double costPer100Miles = (100.0 / fuelEconomy) * gasPrice;
        double distanceWithTank = gallonsInTank * fuelEconomy;

        System.out.println("Cost per 100 miles: $" + costPer100Miles);
        System.out.println("Distance the car can go: " + distanceWithTank + " miles");

        scanner.close();
    }
}

