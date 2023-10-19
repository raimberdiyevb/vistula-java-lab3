import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight : ");
        float weight = scanner.nextFloat();
        System.out.println("Enter your height in Centimeters : ");
        float height = scanner.nextFloat();
        float bmi = (float) (weight / Math.pow(height/100,2));
        if(bmi < 16.00){
            System.out.printf("BMI jkfsjdlfINDEX : %.2f\n",bmi);
            System.out.println("RESULT   : Starvation");
        } else if(bmi >= 16.00 && bmi < 17){
            System.out.printf("BMI INDEX : %.2f\n",bmi);
            System.out.println("RESULT   : Emaciation");
        } else if(bmi >= 17.00 && bmi < 18.5){
            System.out.printf("BMI INDEX : %.2f\n",bmi);
            System.out.println("RESULT   : Underweight");
        } else if(bmi >= 18.5 && bmi < 23){
            System.out.printf("BMI INDEX : %.2f\n",bmi);
            System.out.println("RESULT   : Normal low range");
        } else if(bmi >= 23 && bmi < 25){
            System.out.printf("BMI INDEX : %.2f\n",bmi);
            System.out.println("RESULT   : Normal high range");
        } else if(bmi >= 25 && bmi < 27.5){
            System.out.printf("BMI INDEX : %.2f\n",bmi);
            System.out.println("RESULT   : Overweight low range");
        } else if(bmi >= 27.5 && bmi < 30){
            System.out.printf("BMI INDEX : %.2f\n",bmi);
            System.out.println("RESULT   : Overweight high range");
        } else if(bmi >= 30 && bmi < 35){
            System.out.printf("BMI INDEX : %.2f\n",bmi);
            System.out.println("RESULT   : 1st degree obesity");
        } else if(bmi >= 35 && bmi < 40){
            System.out.printf("BMI INDEX : %.2f\n",bmi);
            System.out.println("RESULT   : 2nd degree obesity");
        }else{
            System.out.printf("BMI INDEX : %.2f\n",bmi);
            System.out.println("RESULT   : 3d degree obedity");
        }

    }
}
