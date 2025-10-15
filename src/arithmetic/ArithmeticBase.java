package arithmetic;

import java.util.Scanner;

enum Operation {
    PLUS {
        @Override
        public double apply(double a, double b) {
            return a + b;
        }
    },
    MINUS {
        @Override
        public double apply(double a, double b) {
            return a - b;
        }
    },
    TIMES {
        @Override
        public double apply(double a, double b) {
            return a * b;
        }
    },
    DIVIDE {
        @Override
        public double apply(double a, double b) {
            if (b == 0) throw new ArithmeticException("Division by zero");
            return a / b;
        }
    };

    public abstract double apply(double a, double b);
}

public class ArithmeticBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double x = sc.nextDouble();

        System.out.print("Enter second number: ");
        double y = sc.nextDouble();

        System.out.println("\nResults:");
        for (Operation op : Operation.values()) {
            try {
                double result = op.apply(x, y);
                System.out.println(op.name() + " of " + x + " and " + y + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println(op.name() + ": " + e.getMessage());
            }
        }

        sc.close();
    }
}
