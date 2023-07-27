package Calcul.domain;

import java.util.ArrayList;
import java.util.List;

public enum DrawbleStatus {

    SQUARE{
        @Override
        double excute(List<Point> pointList) {
            double w = pointList.get(0).getDistance(pointList.get(1));
            double h = (int)pointList.get(1).getDistance(pointList.get(2));
            return w*h;
        }
    },
    LINE{
        @Override
        double excute(List<Point> pointList) {
            return pointList.get(0).getDistance(pointList.get(1));
        }
    },
    TRIANGLE{
        @Override
        double excute(List<Point> pointList) {
           List<Double> sides  =new ArrayList<>();

            sides.add(pointList.get(0).getDistance(pointList.get(1)));
            sides.add(pointList.get(0).getDistance(pointList.get(2)));
            sides.add(pointList.get(1).getDistance(pointList.get(2)));

            double s = (sides.stream().mapToDouble(d -> d.doubleValue()).sum())/2;

            double result = sides.stream().reduce(s,(a,b)-> a*(s-b)).doubleValue();

            return result;
        }

    };

    abstract double excute(List<Point> points);

}
