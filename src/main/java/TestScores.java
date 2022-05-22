import java.util.Scanner;
public class TestScores {


    public static void main(String[] args) {

        int grade = inputGrade();
        System.out.println(whatIsGrade(grade));
    }


    public static int inputGrade() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter grade between 0 and 100");
        return input.nextInt();
    }


    public static String whatIsGrade(int grade) {
        if (grade >= 90) {
            return "You have an A! Yay!";
        } else if (grade >= 80) {
            return "OMG, it's a B!";
        } else if (grade >= 70) {
            return "C's don't get degrees!";
        } else if (grade >= 60) {
            return "A D is dissapointing";
        } else if (grade <= 59) {

            return "F. This is sad. Please study.";
        }else{
            return null;
        }





    }




}
