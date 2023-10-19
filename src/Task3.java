import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double b;
        double c;
        while(a == 0) {
            System.out.println("Enter value of a: ");
            a = scanner.nextDouble();
        }
        System.out.println("Enter value of b: ");
        b = scanner.nextDouble();
        System.out.println("Enter value of c: ");
        c = scanner.nextDouble();
        System.out.printf("a = %.2f,b = %.2f,c = %.2f\n",a,b,c);
        int numOfRoots = 0;
        double delta = Math.pow(b,2) - (4 * a * c);
        if(delta > 0){
            numOfRoots = 2;
        }else if(delta == 0){
            numOfRoots = 1;
        }
        double x1;
        double x2;
        x1 = ((-1 * b) + Math.sqrt(delta)) / 2 * a;
        switch (numOfRoots) {
            case 2 -> {
                x2 = ((-1 * b) - Math.sqrt(delta)) / 2 * a;
                System.out.println("x1 : " + x1);
                System.out.println("x2 : " + x2);
            }
            case 1 ->
                System.out.println("x1 : " + x1);
            case 0 ->
                System.out.println("No root");
        }
    }
}
