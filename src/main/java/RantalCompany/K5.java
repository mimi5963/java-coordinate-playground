package RantalCompany;

public class K5 extends Car{

    public K5(int kmeter){
        super(kmeter);
    }
    @Override
    public int getfuelEfficiency() {
        return super.kmeter/13;
    }
    @Override
    public String toString() {
        return "K5";
    }
}
