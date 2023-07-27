package Calcul.domain;

import Calcul.util.Calutil;

import java.util.List;

public class Square implements Drawable{

    private Points points;
    private static DrawbleStatus ds = DrawbleStatus.SQUARE;

    public Square(String s){
       points = new Points(Calutil.getPoints(s));
    }

    @Override
    public void action() {
        if(!(points.isSqure())){
            System.out.println("사각형이 아닙니다. 새로운 사각형을 만들어서 테스트하세요");
            return;
        }

        System.out.printf("사각형의 넓이는: %d\n",getWH());
    }

    private int getWH(){
        return (int)points.execute(ds);
    }


}
