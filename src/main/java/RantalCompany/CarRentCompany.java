package RantalCompany;

public class CarRentCompany extends RentCompnay{
    private static CarRentCompany carrentCompany = new CarRentCompany();
    private CarRentCompany(){
      super();
    }

    public static RentCompnay getCompany() {
        if(carrentCompany == null) carrentCompany =new CarRentCompany();
        return carrentCompany;
    }

    @Override
    public String genrateReport() {
        String result="";
        for(Vehicle c : super.vehicleList){
            Car car = (Car)c;
            result += car.toString()+" : "+car.getfuelEfficiency()+"리터\n";
        }

        return result;
    }


}
