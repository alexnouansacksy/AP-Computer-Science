// Alex Nouansacksy
// Prog410tCl
public class Cl410t {
    int myIncome;
    int myFamilyCount;
    int myMembers;
    int myPovertyCount;
    int myPovertyPercentage;

    public Cl410t(int income, int familycount, int members) {
        myIncome = income;
        myFamilyCount = familycount;
        myMembers = members;
    }

    public void getPovertyPercentage() {
        if (myIncome < (3750 + (750 * (myMembers - 2)))) myPovertyCount++;
        myPovertyPercentage = myPovertyCount / myFamilyCount;
    }

    public String toString() {
        return String.format("Percent of households below the poverty level: %.7f\n", myPovertyPercentage);
    }
    public void print() {System.out.println(this.toString());}
}
