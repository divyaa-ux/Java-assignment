import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter logical operator (& or |): ");
        char op = sc.next().charAt(0);

        if (op == '&') {
            System.out.println("Result: " + (a & b));
        } else if (op == '|') {
            System.out.println("Result: " + (a | b));
        } else {
            System.out.println("Invalid Operator");
        }

        sc.close();
    }
}
