package Calcul.domain;

import java.util.List;

public class Points {
    private List<Point> pointList;

    public Points(List<Point> pointList){
        this.pointList = pointList;
    }

    public boolean isSqure(){
        if(pointList.get(0).getDistance(pointList.get(1)) != pointList.get(2).getDistance(pointList.get(3)))
            return false;
        if(pointList.get(0).getDistance(pointList.get(3)) != pointList.get(1).getDistance(pointList.get(2)))
            return false;
        return true;
    }

    public double execute(DrawbleStatus ds){
        return ds.excute(pointList);
    }

}
