import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= 0 && num <= 9) {
            System.out.println("Number of digits = 1");
        } else if (num >= 10 && num <= 99) {
            System.out.println("Number of digits = 2");
        } else if (num >= 100 && num <= 999) {
            System.out.println("Number of digits = 3");
        } else if (num >= 1000 && num <= 9999) {
            System.out.println("Number of digits = 4");
        } else if (num >= 10000 && num <= 99999) {
            System.out.println("Number of digits = 5");
        } else {
            System.out.println("Number is outside the five-digit range");
        }

        sc.close();
    }
}
