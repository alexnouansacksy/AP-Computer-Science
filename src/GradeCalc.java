// Alex Nouansacksy
// 09/26/22
// Grade Calc
import java.util.*;
public class GradeCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your grade as a percent: ");
        double gp = input.nextDouble();

        String grade = "";
        if (gp >= 90) grade = "A";
        else if (gp >= 80) grade = "B";
        else if (gp >= 70) grade = "C";
        else if (gp >= 60) grade = "D";
        else grade = "F";

        /*
        if (gp >=90) grade = "A";
        if (gp >= 80 && gp < 90) grade = "B";
         */


        System.out.println("Your grade is a(n) " + grade);
    }
}
/*
Enter your grade as a percent: 97.5
Your grade is a(n) A
 */