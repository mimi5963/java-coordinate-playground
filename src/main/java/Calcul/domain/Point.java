package Calcul.domain;

import Calcul.util.Calutil;

import java.util.Objects;

public class Point implements Drawable{
    private final int x;
    private final int y;
    public Point(String s){
        this(Calutil.brasplit(s));
    }
    public Point(int[] temp){
        if(!Calutil.validint(temp))
            throw new IllegalArgumentException("유효하지 않은 숫자");
        this.x = temp[0];
        this.y = temp[1];
    }

    @Override
    public void action() {
        System.out.println("x : "+x+" y : "+ y);
    }

    public double getDistance(Point point) {
        double result;
        double xDistance = Math.pow(x-point.x,2);
        double yDistance = Math.pow(y- point.y,2);
        result = Math.sqrt(xDistance+yDistance);
        return result;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

}
