// Alex Nouansacksy
// Prog435a
// 11/11/2022
import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class Prog435a {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog435a.dat"));
            Cl435a[] list = new Cl435a[1000];
            int cnt = 0;


            while (keyboard.hasNext()) {
                int vehicleType = keyboard.nextInt();
                int gate = keyboard.nextInt();
                Cl435a wow = new Cl435a(vehicleType, gate);
                list[cnt] = wow;
                cnt += 2;
            }

            for (int lcv = 0; lcv < cnt; lcv+= 2) {
                list[lcv].calc();
            }

            out.println("Car Type\t\tBase Toll\tFactor\tCost");

            for (int lcv = 0; lcv < cnt; lcv += 2)
                out.println(list[lcv].toString());
        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
/*
Car Type		Base Toll	Factor	Cost
Compact Car  	$1.35		1.00	$1.35
Small Car    	$2.50		1.30	$3.25
Mid Size Car 	$4.10		1.60	$6.56
Full Size Car	$5.50		2.00	$11.00
Truck        	$2.00		2.40	$4.80
16 Wheeler   	$3.25		2.70	$8.78
Compact Car  	$4.80		1.00	$4.80
Small Car    	$6.00		1.30	$7.80
Mid Size Car 	$1.35		1.60	$2.16
Full Size Car	$2.50		2.00	$5.00
Truck        	$4.10		2.40	$9.84
16 Wheeler   	$5.50		2.70	$14.85
Compact Car  	$6.00		1.00	$6.00
Small Car    	$1.35		1.30	$1.76
Mid Size Car 	$2.00		1.60	$3.20
Full Size Car	$2.50		2.00	$5.00
Truck        	$3.25		2.40	$7.80
16 Wheeler   	$4.10		2.70	$11.07

Process finished with exit code 0

 */
