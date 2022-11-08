import java.util.*;
import java.io.*;

public class dfile {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog285b.dat"));

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

//Replit might need: Scanner keyboard = new Scanner(new File(pathname: "../data/prog285b.dat"));
