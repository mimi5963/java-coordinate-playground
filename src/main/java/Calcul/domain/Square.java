package Calcul.domain;

import Calcul.util.Calutil;

import java.util.List;

public class Square implements Drawable{
    private List<Point> pointList;
    private final int w;
    private final int h;
    public Square(String s){
        pointList = Calutil.getPoints(s);
        w = (int)pointList.get(0).getDistance(pointList.get(1));
        h = (int)pointList.get(1).getDistance(pointList.get(2));
    }



    @Override
    public void action() {
        if(!squareValidate()){
            System.out.println("사각형이 아닙니다. 새로운 사각형을 만들어서 테스트하세요");
            return;
        }

        System.out.println("사각형의 넓이는:"+w*h);
    }
    private boolean squareValidate(){
        if(pointList.get(0).getDistance(pointList.get(1)) != pointList.get(2).getDistance(pointList.get(3)))
            return false;
        if(pointList.get(0).getDistance(pointList.get(3)) != pointList.get(1).getDistance(pointList.get(2)))
            return false;
        return true;
    }

}
