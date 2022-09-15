// Alex Nouansacksy
// 9/5/2022
// Prog82a

import java.util.*;

public class Prog82a {
    public static void  main(String[] args) {

        Scanner keyboard = new Scanner((System.in));

        System.out.print("Speed Limit: ");
        int limit = keyboard.nextInt();

        System.out.print("Vehicle Speed: ");
        int speed = keyboard.nextInt();

        int fine = 20 + (speed - limit) * 5;

        System.out.print("Fine --------- $" + fine);
    }
}
/*
Speed Limit: 55
Vehicle Speed: 70
Fine --------- $95
 */
