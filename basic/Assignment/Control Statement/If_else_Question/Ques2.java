/*
Question 2: BMI Calculator
Create a program that calculates the Body Mass Index (BMI) based on a person's weight and height. Categorize the BMI using the following ranges:

BMI < 18.5: Underweight
18.5 <= BMI < 24.9: Normal weight
25 <= BMI < 29.9: Overweight
BMI >= 30: Obesity
*/import java.util.Scanner;

public class Ques2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Height in cm: ");
        int h = sc.nextInt();
        System.out.println();

        System.out.print("Enter the Weight in kg: ");
        int w = sc.nextInt();
        System.out.println();

        h = h / 100;
        double bmi = w / (h * h);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        sc.close();
    }
}
