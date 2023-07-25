package RantalCompanyTest;

import RantalCompany.*;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class RantCompanyTest {
    private static final String NEWLINE = System.getProperty("line.separator");
    @Test
    void report() throws Exception{
        RentCompnay company = RentCompnay.create();
        company.addVehicle(new Sonata(150));
        company.addVehicle(new K5(260));
        company.addVehicle(new Sonata(120));
        company.addVehicle(new Avante(300));
        company.addVehicle(new K5(390));

        String report = company.genrateReport();

        assertThat(report).isEqualTo(
                "Sonata : 15리터" + NEWLINE +
                        "K5 : 20리터" + NEWLINE +
                        "Sonata : 12리터" + NEWLINE +
                        "Avante : 20리터" + NEWLINE +
                        "K5 : 30리터" + NEWLINE
        );
    }
}
