package CaraulTest;

import Calcul.domain.*;
import Calcul.drawFactory.DrawFactory;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    @Test
    void 해론(){
        List<Double> list = Arrays.asList(6.2,9.2,10.2);

        double s = (list.stream().mapToInt(i -> i.intValue()).sum())/2;
        double result = list.stream().reduce(s,(a,b)->{
           return a*(s-b);
        }).intValue();
        assertThat(result).isEqualTo(841);
    }
    @Test
    void 트라이앵글(){
        Drawable da = DrawFactory.getInstance("(10,10)-(14,15)-(20,8)");
        da.action();
        assertThat(da instanceof Triangle).isTrue();
    }



}
