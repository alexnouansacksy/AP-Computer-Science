// Alex Nouansacksy
// 09/15/22
// Prog72t

import java.util.*;


public class Prog72t {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner((System.in));

        System.out.print("Enter the first time: ");
        double firstTime = keyboard.nextDouble();

        System.out.print("Enter the second time: ");
        double secondTime = keyboard.nextDouble();

        int hours = 0;
        double minutes = 0;
        double time = 0;
        if (firstTime < secondTime) {
            time = secondTime - firstTime;

        } else {
            time = (2400 - firstTime) + secondTime;
        }
        int difference = (int)time / 100;
        time -= (difference * 40);
        hours = (int) time / 60;
        minutes = time % 60;
        System.out.print(hours + " hours " + minutes + " minutes");

    }
}
/*
Enter the first time: 900
Enter the second time: 1730
8 hours 30.0 minutes
*.
