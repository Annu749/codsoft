import java.util.Scanner;

public class currencyconverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Currency Converter");

        System.out.print("Enter base currency (USD/INR/EUR): ");
        String base = sc.nextLine().toUpperCase();

        System.out.print("Enter target currency (USD/INR/EUR): ");
        String target = sc.nextLine().toUpperCase();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double rate = getRate(base, target);

        if (rate == 0) {
            System.out.println("Invalid currency combination.");
        } else {
            double result = amount * rate;
            System.out.printf("Converted Amount: %.2f %s\n", result, target);
        }

        sc.close();
    }

    public static double getRate(String base, String target) {
        if (base.equals("USD") && target.equals("INR")) return 83.50;
        if (base.equals("USD") && target.equals("EUR")) return 0.92;
        if (base.equals("INR") && target.equals("USD")) return 0.012;
        if (base.equals("INR") && target.equals("EUR")) return 0.011;
        if (base.equals("EUR") && target.equals("USD")) return 1.08;
        if (base.equals("EUR") && target.equals("INR")) return 90.40;
        if (base.equals(target)) return 1.0;
        return 0;
    }
}
