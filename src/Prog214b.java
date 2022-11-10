import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

// Alex Nouansacksy
// Prog214b
// 11/07/2022
public class Prog214b {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog214b.dat"));

            Cl214b[] list = new Cl214b[1000];
            int cnt = 0;

            while (keyboard.hasNext()) {
                int ID = keyboard.nextInt();
                double ytd = keyboard.nextDouble();
                double rate = keyboard.nextDouble();
                double shiftCode = keyboard.nextDouble();
                double hours = keyboard.nextDouble();

                Cl214b wow = new Cl214b(ID, ytd, rate, shiftCode, hours);
                list[cnt] = wow;
                cnt += 5;
            }

            for (int lcv = 0; lcv < cnt; lcv += 5)
                list[lcv].calc();

            for (int lcv = 0; lcv < cnt; lcv += 5)
                out.println(list[lcv].toString());

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Employee Number: 1001	Hours: 34.5	Shift Factor: 1.25	Gross Pay: 194.06	Year-to date: 1056.1
Withholding: 23.29	FICA: 11.74	Net Pay: 159.03

Employee Number: 1002	Hours: 25.0	Shift Factor: 1.0	Gross Pay: 81.25	Year-to date: 3970.0
Withholding: 0.00	FICA: 4.92	Net Pay: 76.33

Employee Number: 1003	Hours: 30.0	Shift Factor: 1.0	Gross Pay: 120.00	Year-to date: 12485.5
Withholding: 9.60	FICA: 7.26	Net Pay: 103.14

Employee Number: 1004	Hours: 38.5	Shift Factor: 1.5	Gross Pay: 303.19	Year-to date: 15587.4
Withholding: 53.06	FICA: 18.34	Net Pay: 231.79

Employee Number: 1005	Hours: 40.0	Shift Factor: 1.0	Gross Pay: 250.00	Year-to date: 17188.5
Withholding: 37.50	FICA: 8.38	Net Pay: 204.12

Employee Number: 1006	Hours: 48.0	Shift Factor: 1.5	Gross Pay: 644.40	Year-to date: 19109.4
Withholding: 112.77	FICA: 0.00	Net Pay: 531.63

Employee Number: 1007	Hours: 35.0	Shift Factor: 1.5	Gross Pay: 262.50	Year-to date: 15600.0
Withholding: 39.38	FICA: 15.88	Net Pay: 207.24

Process finished with exit code 0


 */