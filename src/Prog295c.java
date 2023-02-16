// Alex Nouansacksy
// Prog 295c
// 02/14/2023

import java.io.File;
import java.io.IOException;
import java.util.*;

import static java.lang.System.out;

public class Prog295c {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/merge1.dat"));
            Scanner keyboard2 = new Scanner(new File("data/merge2.dat"));

            ArrayList<Cl295c> list = new ArrayList<>();

            while (keyboard.hasNext()) {
                String SSN = keyboard.next();
                String info = keyboard.next();
                Cl295c wow = new Cl295c(SSN, info);
                wow.setStuff();
                list.add(wow);
            }

            while (keyboard2.hasNext()) {
                String SSN = keyboard2.next();
                String info = keyboard2.next();
                Cl295c wow = new Cl295c(SSN, info);
                wow.setStuff();
                list.add(wow);
            }


            list = SortingAlgs.insertionSort(list);


            for (Cl295c i : list) {
                out.println(i.getSSN() + "\t" + i.getMyClass() + "\t" + i.getType() + "\t" + i.getMyDept());
            }


        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
/* merge1 & merge2
000-00-0001	A	B	1
111-11-1111	A	B	1
123-45-6789	C	F	5
222-22-2227	D	L	9
321-01-2345	A	B	1
357-86-4219	C	F	5
411-52-9485	D	L	9
432-23-3489	A	B	1
514-98-1234	A	B	1
514-98-5555	C	F	5
521-96-8743	C	F	5
522-77-8765	C	F	5
522-77-8766	C	F	5
522-77-8767	C	F	5
525-25-2525	A	B	1
531-45-9260	C	F	5
538-11-1234	D	L	9
539-12-1235	D	L	9
540-13-1236	D	L	9
541-14-1237	C	F	5

Process finished with exit code 0

 */

/* merge3 & merge4
000-00-0001	A	B	1
111-11-1111	A	B	1
123-45-6789	C	F	5
222-22-2227	D	L	9
321-01-2345	A	B	1
357-86-4219	C	F	5
411-52-9485	D	L	9
432-23-3489	A	B	1
514-98-1234	A	B	1
514-98-5555	C	F	5
521-96-8743	C	F	5
522-77-8765	C	F	5
522-77-8766	C	F	5
522-77-8767	C	F	5
525-25-2525	A	B	1
531-45-9260	C	F	5
538-11-1234	D	L	9
539-12-1235	D	L	9
540-13-1236	D	L	9
541-14-1237	C	F	5

Process finished with exit code 0

 */