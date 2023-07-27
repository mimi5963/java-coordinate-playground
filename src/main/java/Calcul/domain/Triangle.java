package Calcul.domain;

import Calcul.util.Calutil;

import java.util.ArrayList;
import java.util.List;

public class Triangle implements Drawable{

    private  Points points;
    private static DrawbleStatus ds = DrawbleStatus.TRIANGLE;

    public Triangle(String s){
        points = new Points(Calutil.getPoints(s));

    }

    @Override
    public void action() {
        double S;
        S = Math.sqrt(getNonSqrt());
        System.out.printf("%.1f",S);
    }

    public Double getNonSqrt(){
        return points.execute(ds);
    }

}
