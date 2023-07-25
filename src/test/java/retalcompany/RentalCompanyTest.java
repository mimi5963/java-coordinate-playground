package retalcompany;

import org.junit.jupiter.api.Test;
import rentalcompany.Factory.CarRentalCompanyFactory;
import rentalcompany.Factory.RentalCompanyFactroy;
import rentalcompany.domain.CarRentalCompany;
import rentalcompany.domain.RentalCompany;
import static org.assertj.core.api.Assertions.*;
public class RentalCompanyTest {
    @Test
    void FactoryTest(){
        RentalCompanyFactroy rcf = new CarRentalCompanyFactory();
        RentalCompany rc = rcf.createOperation();
        assertThat(rc instanceof CarRentalCompany).isTrue();

        RentalCompany rc2 = RentalCompany.create();
        assertThat(rc2 instanceof CarRentalCompany).isTrue();

    }
    @Test
    void efficiencyT(){
        
    }
}
