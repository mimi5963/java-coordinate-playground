package Calcul.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Calcul.domain.Point;
public class Calutil {
    private final static int MAX_BOUND =24;
    private final static int MIN_BOUND=0;
    public static int[] brasplit(String xy) {
        int[] temp = new int[2];
        Matcher m = Pattern.compile("\\((.*),(.*)\\)").matcher(xy);
        if(m.find()){
            temp[0] = Integer.parseInt(m.group(1));
            temp[1] = Integer.parseInt(m.group(2));
        }
        return temp;
    }
    public static List<Point> getPoints(String xy){
        List<Point> temp = new ArrayList<>();
        String[] xys = xy.split("-");
        for(String s : xys){
            temp.add(new Point(s));
        }
        return temp;
    }
    public static boolean validint(int[] val){
        if(val[0] < MIN_BOUND || val[0]>MAX_BOUND || val[1] <MIN_BOUND || val[1]>MAX_BOUND)
            return false;

        return true;
    }
    public static int splitlength(String s){
        String delimiter ="-";
        return s.split(delimiter).length;
    }
}
