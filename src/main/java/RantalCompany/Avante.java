package RantalCompany;

public class Avante extends Car{

    public Avante(int kmeter){
        super(kmeter);
    }
    @Override
    public int getfuelEfficiency() {
        return super.kmeter/15;
    }

    @Override
    public String toString() {
        return "Avante";
    }
}
