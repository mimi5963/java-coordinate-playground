package rentalcompany.domain;

public class K5 extends Car{
    private static final int DISTANCEPERLITER = 13;
    public K5(int distance){
        super(distance);
    }
    @Override
    public double getDistancePerLiter() {
        return DISTANCEPERLITER;
    }

    @Override
    public double getTripDistance() {
        return super.Distance;
    }

    @Override
    public String getName() {
        return "K5";
    }


}
