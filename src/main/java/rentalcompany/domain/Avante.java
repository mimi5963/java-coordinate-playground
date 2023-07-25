package rentalcompany.domain;

public class Avante extends Car{
    private static final int DISTANCEPERLITER = 15;
    public Avante(int distance){
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
        return "Avante";
    }


}
