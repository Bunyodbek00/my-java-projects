import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator App");

        //take inputs
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        //arithmetic operators
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;


        //print the results
        if (operator == '+') {
            System.out.printf("Sum: %.2f\n", sum);
        } else if (operator == '-') {
            System.out.printf("Difference: %.2f\n", difference);
        } else if (operator == '*') {
            System.out.printf("Product: %.2f\n", product);
        } else if (operator == '/') {
            if (num2 != 0) {
                System.out.printf("Quotient: %.2f\n", num1 / num2);
            } else {
                System.out.println("Cannot divide by zero!");
            }
        } else {
            System.out.println("Invalid operator!");
        }

        scanner.close();
    }
}
