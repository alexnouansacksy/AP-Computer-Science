package Farm2;

public class Animal {
    private int myWeight;
    private int myHayBales;
    private int myCorn;

    public Animal (int weight, int haybales, int corn) {
        myWeight = weight;
        myHayBales = haybales;
        myCorn = corn;
    }

    public void setWeight(int weight) {myWeight = weight;}
    public void setHay(int hay) {myHayBales = hay;}
    public void setCorn(int corn) {myCorn = corn;}


    public int getWeight() {return myWeight;}
    public int getHayBales() {return myHayBales;}
    public int getCorn() {return myCorn;}


}
