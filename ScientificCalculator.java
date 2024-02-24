import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Scientific Calculator!");

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the operation (sin, cos, tan, sqrt, exp, log): ");
        String operation = scanner.next();

        double result = 0.0;
        switch (operation) {
            case "sin":
                result = sin(num1);
                break;
            case "cos":
                result = cos(num1);
                break;
            case "tan":
                result = tan(num1);
                break;
            case "sqrt":
                result = sqrt(num1);
                break;
            case "exp":
                result = exp(num1);
                break;
            case "log":
                result = log(num1);
                break;
            default:
                System.out.println("Error! Invalid operation.");
        }
        
        System.out.println("Result: " + result);
        
        scanner.close();
    }

    public static double sin(double num) {
        return Math.sin(num);
    }

    public static double cos(double num) {
        return Math.cos(num);
    }

    public static double tan(double num) {
        return Math.tan(num);
    }

    public static double sqrt(double num) {
        return Math.sqrt(num);
    }

    public static double exp(double num) {
        return Math.exp(num);
    }

    public static double log(double num) {
        return Math.log(num);
    }
}
