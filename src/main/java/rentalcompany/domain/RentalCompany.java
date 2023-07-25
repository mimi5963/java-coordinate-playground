package rentalcompany.domain;

import rentalcompany.Factory.CarRentalCompanyFactory;
import rentalcompany.Factory.RentalCompanyFactroy;

public interface RentalCompany {
    public static RentalCompany create(){
        RentalCompanyFactroy fcf = new CarRentalCompanyFactory();
        return fcf.createOperation();
    }
    public void addVehicle(Vehicle v);
    String generateReport();
}
