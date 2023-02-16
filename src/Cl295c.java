public class Cl295c {
    private String mySSN;
    private String myInfo;
    private int intSSN;
    private char myClass;
    private char myType;
    private int myDept;

    public Cl295c(String ssn, String info) {
        mySSN = ssn;
        myInfo = info;
    }

    public void setStuff() {
        String social = mySSN.substring(0, 3) + mySSN.substring(4, 5) + mySSN.substring(7);
        intSSN = Integer.parseInt(social);
        myClass = myInfo.charAt(0);
        myType = myInfo.charAt(1);
        myDept = Integer.parseInt(myInfo.substring(2));
    }

    public String getSSN() {return mySSN;}
    public int getIntSSN() {return intSSN;}
    public char getMyClass() {return myClass;}
    public char getType() {return myType;}
    public int getMyDept() {return myDept;}

}
