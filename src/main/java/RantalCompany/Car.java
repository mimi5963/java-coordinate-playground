package RantalCompany;

public abstract class Car implements Vehicle{
    protected int kmeter;
    protected Car(int kmeter){
        this.kmeter = kmeter;
    }
    public abstract int getfuelEfficiency();

}
