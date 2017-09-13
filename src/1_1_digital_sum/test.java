package sqrt;

import java.lang.Math.*;

/**
 * Created by SBT-Kardashov-FM on 09.11.2016.
 */

public class test {


    public static void main(String[] args) {
    System.out.print(sqrt(-2));
    }
    public static double sqrt(double s){
        if (s < 0) throw new  java.lang.IllegalArgumentException( "Expected non-negative number, got " + s);
        return Math.sqrt(s);
    }
}
