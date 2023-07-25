package RantalCompany;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public abstract class RentCompnay {
    List<Vehicle> vehicleList = new ArrayList<>();
    private static RentCompnay rc;
    RentCompnay(){
       // rc = getCompany();
    }

   //public abstract RentCompnay getCompany();
    public abstract String genrateReport();
   public void addVehicle(Vehicle v){
       vehicleList.add(v);
   };
    public static RentCompnay create() {
        return rc = CarRentCompany.getCompany();
    }

}
