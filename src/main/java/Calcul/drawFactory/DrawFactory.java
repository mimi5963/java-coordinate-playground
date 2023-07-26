package Calcul.drawFactory;

import Calcul.domain.Drawable;
import Calcul.util.Calutil;

public abstract class DrawFactory {
    private  static  DrawFactory ins;

    public static Drawable getInstance(String s){
        FactoryMapper ms = new FactoryMapper();
        ins = ms.getFactoryFromMap(Calutil.splitlength(s));
        return ins.getDraw(s);
    }


    public abstract Drawable getDraw(String s);

}


