package Calcul.drawFactory;

import Calcul.domain.Drawable;
import Calcul.domain.Line;

public class LineFactory extends DrawFactory{
    @Override
    public Drawable getDraw(String s) {
        return new Line(s);
    }
}
