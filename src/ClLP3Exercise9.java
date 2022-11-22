// Alex Nouansacksy
// LP3Exericse9Cl
// 11/21/2022
public class ClLP3Exercise9 {
    private int myBirthYear;
    private int myBirthMonth;
    private int myBirthDay;
    private int myCurrentYear;
    private int myCurrentMonth;
    private int myCurrentDay;

    private int myDaysAtBirth;
    private int myTotalDaysNow;
    private int myDaysAlive;
    private int myHoursSlept;

    public ClLP3Exercise9 (int birthYear, int birthMonth, int birthDay, int currentYear, int currentMonth, int currentDay) {
        myBirthYear = birthYear;
        myBirthMonth = birthMonth;
        myBirthDay = birthDay;
        myCurrentYear = currentYear;
        myCurrentMonth = currentMonth;
        myCurrentDay = currentDay;
        myDaysAtBirth = 0;
        myTotalDaysNow = 0;
    }

    public void setStuff() {
        myDaysAlive = (365 * myCurrentYear + 30 * myCurrentMonth + myCurrentDay) -
                (365 * myBirthYear + 30 * myBirthMonth + myBirthDay);
        myHoursSlept = (myDaysAlive * 8);
    }

    public String toString() {return String.format("You have been alive for %d days.\nYou have slept for %d hours",
            myDaysAlive, myHoursSlept);}

    public void print() {
        System.out.println(this.toString());
    }

}

