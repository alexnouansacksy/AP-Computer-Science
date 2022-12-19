import java.io.File;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;
// Alex Nouansacksy
// Big ArrayList
// 12/19/2022


public class BigArrayListCat {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/bigarraylist.dat"));
            int numCats = keyboard.nextInt();
            keyboard.nextLine();
            ArrayList<Cat> cats = new ArrayList<Cat>();

            for (int lcv = 0; lcv < numCats; lcv++) {
                String name = keyboard.nextLine();
                double weight = keyboard.nextDouble();
                int age = keyboard.nextInt();
                double cost = keyboard.nextDouble();
                keyboard.nextLine();
                cats.add(new Cat(name, weight, age, cost));
            }
            // 1. Print out all the cats (there is no toString() available)
            out.println("1. All the cats:");
            out.println("Name\tWeight\tAge\tCost");
            for(Cat cat : cats) {
                out.println(cat.getName() + "\t" + cat.getWeight() + "\t" + cat.getAge() + "\t" + cat.getCost());
            }

            // 2. Print the name of the 3rd cat.
            out.println("\n2. The third cat is named: " + cats.get(2).getName());

            // 3. The last cat has gained 10 pounds. Update the weight on the object. Print the new weight.
            cats.get(cats.size() - 1).setWeight(cats.get(cats.size() -1).getWeight()+10);
            out.println("\n3. The update weight is: " + cats.get(cats.size() -1).getWeight());


            // 4. The cat named Rascal died. Find that cat and remove it from the list.
            for (int lcv = 0; lcv < cats.size(); lcv++) {
                if (cats.get(lcv).getName().equals("Rascal")) {
                    cats.remove(lcv);
                }
            }

            // 5. A new kitten was brought in (Angel, 3.6, 1, 25.99).  Insert it into the 2nd cell.
            cats.add(1, new Cat("Angel", 3.6, 1, 25.99));

            // 6. A new geriatric cat was found (Gimpy, 14.3, 10,  29.99). Put him on the list.
            cats.add(new Cat("Gimpy", 14.3, 10, 29.99));

            // 7. Print the updated list with a for-each loop
            out.println("7. The updated list is: ");
            out.println("Name\tWeight\tAge\tCost");
            for(Cat cat : cats) {
                out.println(cat.getName() + "\t" + cat.getWeight() + "\t" + cat.getAge() + "\t" + cat.getCost());
            }

            // 8. Replace the 3rd cat with (Sugar, 23.6, 7, 33.25) put the removed cat at the end of the list.
            Cat third = cats.get(2);
            cats.set(2, new Cat("Sugar", 23.6, 7, 33.25));
            cats.add(third);

            // 9. Switch the 2nd and 4th cats.
            Cat temp = cats.get(1);
            cats.set(1, cats.get(3));
            cats.set(3, temp);

            // 10. Print the names of the cats on the list.
            out.println("\n10. The current cat names are: ");
            for (Cat c : cats) out.print(c.getName() + "\t");
            out.println();

            // 11. Remove all cats under $26. Print the costs of each cat remaining on the list.
            for (int lcv = 0; lcv < cats.size(); lcv++) {
                if (cats.get(lcv).getCost() < 26) {
                    cats.remove(lcv);
                    lcv--;
                }
            }
            out.println("\n11. The costs of the remaining cats are: ");
            for (Cat c : cats)
                out.print(c.getCost() + " ");
            out.println();

            // 12. All cats heavier than 15 pounds need to go on a diet <--  no for-each this time.
            // Print the names of the cats being put on a diet.
            out.println("\n12. The cats being put on a diet are: ");
            for (Cat c : cats) {
                if (c.getWeight() > 15) {
                    out.print(c.getName() + "\t");
                }
            }
            out.println();
        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
/*
1. All the cats:
Name	Weight	Age	Cost
Inky	15.69	2	35.79
Panda	14.3	6	15.03
Rascal	21.1	21	0.0
Blacky	13.99	3	26.89
Taffy	24.5	10	56.89
Toby	17.2	10	37.57

2. The third cat is named: Rascal

3. The update weight is: 27.2
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

11. The costs of the remaining cats are:
35.79 26.89 33.25 56.89 37.57 29.99

12. The cats being put on a diet are:
Inky	Sugar	Taffy	Toby

Process finished with exit code 0
 */