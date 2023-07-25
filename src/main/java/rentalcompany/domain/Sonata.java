package rentalcompany.domain;

public class Sonata extends Car{
    private static final int DISTANCEPERLITER = 10;
    Sonata (int distance){
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
        return "Sonate";
    }


}
