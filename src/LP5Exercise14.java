// Alex Nouansacksy
// 10/05/2022
// LP 5-14
public class LP5Exercise14 {
    public static void main(String[] args) {
        int lcv = 0;
        System.out.println("Dice 1\tDice 2\t Dice 3");
        while (lcv < 5) {
            int dice1 = (int) (Math.random() * (7 - 1) + 1);
            int dice2 = (int) (Math.random() * (7 - 1) + 1);
            int sum = dice1 + dice2;
            System.out.println(dice1 + "\t\t" + dice2 + "\t\t " + sum);
            lcv++;
        }

    }
}
/*
Dice 1	Dice 2	 Dice 3
3		5		 8
3		5		 8
6		2		 8
6		2		 8
5		2		 7

Process finished with exit code 0
 */