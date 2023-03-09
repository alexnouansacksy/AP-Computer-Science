package Farm2;

public class Horse extends Animal{
    private int myRides;
    private double myRidesCost;

    public Horse(int weight, int hayBales, int corn, int rides, double cost) {
        super (weight, hayBales, corn);
        myRides = rides;
        myRidesCost = cost;
    }

}
