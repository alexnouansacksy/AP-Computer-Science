// Alex Nouansacksy
// Big Array Part II
// 11/16/2022
import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class BigArray2 {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/bigarraylist.dat"));
            int numCats = keyboard.nextInt();
            keyboard.nextLine();
            Cat[] cats = new Cat[50];

            for (int lcv = 0; lcv < numCats; lcv++) {
                String name = keyboard.nextLine();
                double weight = keyboard.nextDouble();
                int age = keyboard.nextInt();
                double cost = keyboard.nextDouble();
                keyboard.nextLine();
                cats[lcv] = new Cat(name, weight, age, cost);
            }

            // 1. Print out all the cats (there is no toString() available)
            out.println("1. ALl the cats: ");
            out.println("Name\tWegiht\tAge\tCost");
            for (int lcv = 0; lcv < numCats; lcv++) {
                out.println(cats[lcv].getName() + "\t" + cats[lcv].getWeight() + "\t" + cats[lcv].getAge()
                + "\t" + cats[lcv].getCost());
            }

            // 2. Print the name of the 3rd cat.
            out.println("\n2. The third cat is named: " + cats[2].getName());

            // 3. The last cat has gained 10 pounds. Update the weight on the object. Print the new weight.
            cats[numCats - 1].setWeight(cats[numCats - 1].getWeight() + 10);

            // 4. The cat named Rascal died. Find that cat and remove it from the list.
            int rascalIndex = 0;
            for (int lcv = 0; lcv < numCats; lcv++) {
                if (cats[lcv].getName().equals("Rascal")) {
                    rascalIndex = lcv;
                }
            }
            for (int lcv = rascalIndex; lcv < numCats - 1; lcv ++)
                cats[lcv] = cats[lcv+1];
            numCats--;

            // 5. A new kitten was brought in (Angel, 3.6, 1, 25.99).  Insert it into the 2nd cell.
            //for (int lcv = num Cats + 1; lcv --> 1;)
            for (int lcv = numCats; lcv > 1; lcv--) {
                cats[lcv] = cats[lcv - 1];
            }
            cats[1] = new Cat("Angel", 3.6, 1, 25.99);
            numCats++;

            // 6. A new geriatric cat was found (Gimpy, 14.3, 10,  29.99). Put him on the list.
            cats[numCats] = new Cat("Gimpy", 14.3, 10, 29.99);
            numCats++;

            // 7. Print the updated list with a for-each loop
            out.println("\n7. The updated list is: ");
            out.println("Name\tWeight\tAge\tCost");
            for (Cat cat : cats) {
                if (cat != null)
                out.println(cat.getName() + "\t" + cat.getWeight() + "\t" + cat.getAge() + "\t" + cat.getCost());
            }

            // 8. Replace the 3rd cat with (Sugar, 23.6, 7, 33.25) put the removed cat at the end of the list.
            Cat temp = cats[2];
            cats[2] = new Cat("Sugar", 23.6, 7, 33.25);
            cats[numCats] = temp;
            numCats++;

            // 9. Switch the 2nd and 4th cats.
            Cat tempCat = cats[1];
            cats[1] = cats[3];
            cats[3] = tempCat;

            // 10. Print the names of the cats on the list.
            out.println("\n10. The current cat names are: ");
            for (Cat cat : cats) {
                if (cat != null) out.print(cat.getName() + "\t");
            }
            out.println();

            // 11. Remove all cats under $26. Print the costs of each cat remaining on the list.
            int i = 0;
            while (i < numCats) { // for every cat
                if (cats[i].getCost() < 26) { // if cat costs less than 26
                    for (int j = i; j < numCats - 1; j++)  // shift everything back 1
                        cats[j] = cats[j + 1];
                    numCats--;
                } else {
                    i++;
                }
            }
            out.println("\n11. The cats cost $26 or more actually cost: ");
            for (int lcv = 0; lcv < numCats; lcv++) {
                out.print(cats[lcv].getCost() + " ");
            }
            out.println();

            // 12. All cats heavier than 15 pounds need to go on a diet <--  no for-each this time.Print the names of the cats being put on a diet.
            out.println("\n12. The cats being put on a diet are: ");
            for (int lcv = 0; lcv < numCats; lcv++) {
                Cat cat = cats[lcv];
                if (cat.getWeight() > 15)
                    System.out.print(cat.getName() + "\t");
            }
            System.out.println();

        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
/*
1. ALl the cats:
Name	Wegiht	Age	Cost
Inky	15.69	2	35.79
Panda	14.3	6	15.03
Rascal	21.1	21	0.0
Blacky	13.99	3	26.89
Taffy	24.5	10	56.89
Toby	17.2	10	37.57

2. The third cat is named: Rascal

7. The updated list is:
Name	Weight	Age	Cost
Inky	15.69	2	35.79
Angel	3.6	1	25.99
Panda	14.3	6	15.03
Blacky	13.99	3	26.89
Taffy	24.5	10	56.89
Toby	27.2	10	37.57
Gimpy	14.3	10	29.99

10. The current cat names are:
Inky	Blacky	Sugar	Angel	Taffy	Toby	Gimpy	Panda

11. The cats cost $26 or more actually cost:
35.79 26.89 33.25 56.89 37.57 29.99

12. The cats being put on a diet are:
Inky	Sugar	Taffy	Toby

Process finished with exit code 0

 */