import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        int num1 = input();

        System.out.println("Enter another number: ");
        int num2 = input();

        output(num1, num2);

    }

    public static int input() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static int Addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int Subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int Multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static double Division(int num1, int num2) {
        return (double)num1 / (double)num2;
    }

    public static int Modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static void output(int num1, int num2) {

        int addition = Addition(num1, num2);
        int subtraction = Subtraction(num1, num2);
        int multiplication = Multiplication(num1, num2);
        double division = Division(num1, num2);
        int modulus = Modulus(num1, num2);

        System.out.println(num1 + " + " + num2 + " = " + addition);
        System.out.println(num1 + " + " + num2 + " = " + subtraction);
        System.out.println(num1 + " + " + num2 + " = " + multiplication);
        System.out.println(num1 + " + " + num2 + " = " + division);
        System.out.println(num1 + " + " + num2 + " = " + modulus);

    }
}
