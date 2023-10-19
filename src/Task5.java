import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 101;
        int max = 0;
        for (int i = 0; i < 10; i++) {
            int n = random.nextInt(1,101);
            if(n < min) min = n;
            if(n > max) max = n;
        }

    }
}
