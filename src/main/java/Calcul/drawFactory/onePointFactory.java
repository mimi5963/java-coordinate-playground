package Calcul.drawFactory;

import Calcul.domain.Drawable;
import Calcul.domain.Point;

public class onePointFactory extends DrawFactory{
    @Override
    public Drawable getDraw(String s) {
        return new Point(s);
    }
}
