package CaraulTest;

import Calcul.domain.Drawable;
import Calcul.domain.Line;
import Calcul.domain.Point;
import Calcul.domain.Square;
import Calcul.drawFactory.DrawFactory;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class FactoryTest {
    @Test
    void newLineTest(){
        Drawable da = DrawFactory.getInstance("(10,2)-(20,2)");
        da.action();
        assertThat(da instanceof Line).isTrue();
    }
    @Test
    void onePointTest(){
        Drawable da = DrawFactory.getInstance("(10,2)");
        da.action();
        assertThat(da instanceof Point).isTrue();
    }
    @Test
    void SqureTest(){
        Drawable da = DrawFactory.getInstance("(10,10)-(22,10)-(22,18)-(10,18)");
        da.action();
        assertThat(da instanceof Square).isTrue();
    }
    
}
