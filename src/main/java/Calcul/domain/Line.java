package Calcul.domain;

import Calcul.util.Calutil;

import java.util.ArrayList;
import java.util.List;

public class Line implements Drawable{
    //private List<Point> points;
    private Points points;
    private static DrawbleStatus ds = DrawbleStatus.LINE;
    public Line(String s){
        points = new Points(Calutil.getPoints(s));
    }
    @Override
    public void action() {
        System.out.println(getLineLength());
    }

    private double getLineLength() {
        return points.execute(ds);
    }

}
