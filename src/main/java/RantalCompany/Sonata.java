package RantalCompany;

public class Sonata extends Car{
    public Sonata(int kmeter){
        super(kmeter);
    }
    @Override
    public int getfuelEfficiency() {
        return kmeter/10;
    }
    @Override
    public String toString() {
        return "Sonata";
    }
}
