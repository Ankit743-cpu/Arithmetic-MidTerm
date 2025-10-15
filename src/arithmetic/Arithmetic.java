package arithmetic;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("\nResults:");
        for (Operation op : Operation.values()) {
            try {
                double result = op.apply(num1, num2);
                System.out.println(op.name() + " of " + num1 + " and " + num2 + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println(op.name() + ": " + e.getMessage());
            }
        }

        sc.close();
    }
}
