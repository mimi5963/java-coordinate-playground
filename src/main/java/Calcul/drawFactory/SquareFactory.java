package Calcul.drawFactory;

import Calcul.domain.Drawable;
import Calcul.domain.Square;

public class SquareFactory extends DrawFactory{
    @Override
    public Drawable getDraw(String s) {
        return new Square(s);
    }
}
