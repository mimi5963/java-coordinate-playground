package rentalcompany.Factory;

import rentalcompany.domain.RentalCompany;

public interface RentalCompanyFactroy {
    public default RentalCompany createOperation(){
            RentalCompany temp = getRetalCompany();
            return temp;
    }

    RentalCompany getRetalCompany();
}
