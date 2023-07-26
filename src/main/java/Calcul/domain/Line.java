package Calcul.domain;

import Calcul.util.Calutil;

import java.util.ArrayList;
import java.util.List;

public class Line implements Drawable{
    private List<Point> points;
    public Line(String s){
        points = Calutil.getPoints(s);
    }
    @Override
    public void action() {
        System.out.println(getDistance());
    }

    private double getDistance() {
        return points.get(0).getDistance(points.get(1));
    }

}
