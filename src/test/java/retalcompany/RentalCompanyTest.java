package retalcompany;

import org.junit.jupiter.api.Test;
import rentalcompany.Factory.CarRentalCompanyFactory;
import rentalcompany.Factory.RentalCompanyFactroy;
import rentalcompany.domain.*;

import static org.assertj.core.api.Assertions.*;
public class RentalCompanyTest {
    private static final String NEWLINE = System.getProperty("line.separator");

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
        RentalCompany company = RentalCompany.create();
        company.addVehicle(new Sonata(150));
        company.addVehicle(new K5(260));
        company.addVehicle(new Sonata(120));
        company.addVehicle(new Avante(300));
        company.addVehicle(new K5(390));

        String report = company.generateReport();
        assertThat(report).isEqualTo(
                "Sonata : 15리터" + NEWLINE +
                        "K5 : 20리터" + NEWLINE +
                        "Sonata : 12리터" + NEWLINE +
                        "Avante : 20리터" + NEWLINE +
                        "K5 : 30리터" + NEWLINE
        );
    }
}
