package com.example.pmu1;
/**
 * Class of mathematical functions <b>min</b> and <b>max</b>.
 * @author Dmitry Shumikhin
 * @version 1.1
*/
public class MyMath {
    /**
     * The function of finding the minimum among two integers
     * @see MyMath#min(int, int)
     * @param a - first int number
     * @param b - second int number
     * @return return minimum
     */
    public int min(int a, int b){
        if(a < b) return a;
        return b;
    }
    /**
     * The function of finding the maximum among two integers
     * @see MyMath#max(int, int)
     * @param a - first int number
     * @param b - second int number
     * @return return maximum
     */
    public int max(int a, int b){
        if(a > b) return a;
        return b;
    }
}
