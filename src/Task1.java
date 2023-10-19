import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        float first = scanner.nextFloat();
        System.out.println("Enter second number : ");
        float second = scanner.nextFloat();

        System.out.printf("%.2f + %.2f = %.2f\n",first,second,(first+second));
        System.out.printf("%.2f - %.2f = %.2f\n",first,second,(first-second));
        System.out.printf("%.2f * %.2f = %.2f\n",first,second,(first*second));
        System.out.printf("%.2f / %.2f = %.2f\n",first,second,(first/second));

    }
}