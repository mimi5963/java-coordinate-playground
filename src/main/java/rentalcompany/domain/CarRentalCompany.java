package rentalcompany.domain;

import java.util.ArrayList;
import java.util.List;

public class CarRentalCompany implements RentalCompany{
    List<Car> carList = new ArrayList<>();
    @Override
    public void addVehicle(Vehicle v) {
        if(v instanceof Car)
        carList.add((Car)v);
    }

    @Override
    public String generateReport() {
        String result ="";
        for(Car c:carList){
            result +=c.getName() +" : "+c.getChargeQuantity()+"리터\n";
        }
        return null;
    }
}
