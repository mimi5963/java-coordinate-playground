package Calcul.drawFactory;

import Calcul.domain.Drawable;

import java.util.HashMap;
import java.util.Map;

public class FactoryMapper {
    Map<Integer, DrawFactory> maps = new HashMap<>();

    public FactoryMapper(){
        maps.put(1,new onePointFactory());
        maps.put(2,new LineFactory());
        maps.put(4,new SquareFactory());
    }
    public DrawFactory getFactoryFromMap(int n){
        return maps.get(n);
    }
}
