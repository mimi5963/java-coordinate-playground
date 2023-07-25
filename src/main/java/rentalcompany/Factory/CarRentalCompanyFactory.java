package rentalcompany.Factory;

import rentalcompany.domain.CarRentalCompany;
import rentalcompany.domain.RentalCompany;

public class CarRentalCompanyFactory implements RentalCompanyFactroy {
    @Override
    public RentalCompany getRetalCompany() {
        return new CarRentalCompany();
    }
}
