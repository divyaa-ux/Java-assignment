import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost Price: ");
        float cp = sc.nextFloat();

        System.out.print("Enter Selling Price: ");
        float sp = sc.nextFloat();

        if (sp > cp) {
            float profit = sp - cp;
            System.out.println("Profit = " + profit);
        } else if (cp > sp) {
            float loss = cp - sp;
            System.out.println("Loss = " + loss);
        } else {
            System.out.println("No Profit No Loss");
        }

        sc.close();
    }
}
