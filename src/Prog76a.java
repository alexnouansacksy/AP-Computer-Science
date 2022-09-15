// Alex Nouansacksy
// 09/15/2022
// Prog76a

import java.util.*;
public class Prog76a {
    public static void  main(String[] args) {
        Scanner keyboard = new Scanner((System.in));

        System.out.print("Enter a number you dislike ");
        int num = keyboard.nextInt();

        int product1 = 9 * num;
        int  product2 = product1 * 12345679;

        System.out.print(num);
        System.out.print("\nx 9");
        System.out.print("\n---------");
        System.out.print("\n" + product1);
        System.out.print("\nx 12345679");
        System.out.print("\n---------\n");
        System.out.print(product2 + "  Surprise!");

    }

}
/*
Enter a number you dislike 5
5
x 9
---------
45
x 12345679
---------
555555555  Surprise!
 */
