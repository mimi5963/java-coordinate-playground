package Calcul.domain;

import Calcul.util.Calutil;

import java.util.ArrayList;
import java.util.List;

public class Triangle implements Drawable{
    private List<Point> pointList = new ArrayList<>();
    private List<Double> sides;

    private final double s;



    public Triangle(String s){
        pointList = Calutil.getPoints(s);
        sides = new ArrayList<>();
        for(int i=0; i<pointList.size()-1;i++){
            sides.add(pointList.get(i).getDistance(pointList.get(i+1)));
        }
        sides.add(pointList.get(0).getDistance(pointList.get(2)));

        this.s = getS();
    }

    private double getS() {
        return getSidesum()/2;
    }

    private double getSidesum() {
        return sides.stream().mapToDouble(d -> d.doubleValue()).sum();
    }

    @Override
    public void action() {
        double S;
        S = Math.sqrt(extractSide());
        System.out.printf("%.1f",S);
    }

    private double extractSide() {
       // sides.stream().reduce();
        return sides.stream().
                reduce(s,(a,b)-> a*(s-b))
                .doubleValue();
    }
}
