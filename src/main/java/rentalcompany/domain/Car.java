package rentalcompany.domain;

public abstract class Car implements Vehicle{
    protected int Distance;
    protected Car(int Distance){
        this.Distance = Distance;
    }

    public abstract double getDistancePerLiter();


    public abstract double getTripDistance();


    public abstract String getName();


    public double getChargeQuantity(){
     return getTripDistance()/getDistancePerLiter();
    }

}
