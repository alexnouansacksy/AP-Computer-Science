package Prog7301m;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

public class Prog7301m {
    public static int argmax(double[] a) {
        int max = 0;
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[max]) max = i;
        return max;
    }

    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog7301m_train.csv"));

        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
