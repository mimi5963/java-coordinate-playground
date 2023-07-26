package Calcul.drawFactory;

import Calcul.domain.Drawable;
import Calcul.domain.Triangle;

public class TriangleFactory extends DrawFactory{
    @Override
    public Drawable getDraw(String s) {
        return new Triangle(s);
    }
}
