import java.util.*;
// Alex Nouansacksy
// 9/13/2022
// Program 58i
public class Prog58i {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("The amount I wish to borrow is $");
        double p = input.nextDouble(); // principal

        System.out.println("The loan rate is ");
        double r = input.nextDouble(); // rate

        System.out.println("The number of months it will take me to pay off the loan is ");
        double m = input.nextDouble(); // months

        double mp = p * ((r/1200)* (Math.pow(m, (1+(r/1200)))
                / (Math.pow(m, (1+(r/1200))) - 1)));

        System.out.printf("My monthly payment will be $%.2f\n", mp);
        System.out.printf("The total interest paid is $%.2f\n", mp * m);
        System.out.printf("The total amount paid is $%.2f\n", ((mp*m) + p));

    }
}
