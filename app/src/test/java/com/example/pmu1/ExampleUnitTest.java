package com.example.pmu1;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void test1_max(){
        MyMath myMath = new MyMath();
        int actual = myMath.max(4,9);
        Assert.assertEquals(9, actual);
    }
    @Test
    public void test2_max(){
        MyMath myMath = new MyMath();
        int actual = myMath.max(-1,2);
        Assert.assertEquals(2,actual);
    }
    @Test
    public void test3_max(){
        MyMath myMath = new MyMath();
        int actual = myMath.max(11,9);
        Assert.assertEquals(11,actual);
    }
    @Test
    public void test4_max(){
        MyMath myMath = new MyMath();
        int actual = myMath.max(5,5);
        Assert.assertEquals(5, actual);
    }
    @Test
    public void test1_min(){
        MyMath mymath = new MyMath();
        int actual = mymath.min(-2,9);
        Assert.assertEquals(-2, actual);
    }
    @Test
    public void test2_min(){
        MyMath mymath = new MyMath();
        int actual = mymath.min(-9,-16);
        Assert.assertEquals(-16, actual);
    }
    @Test
    public void test3_min(){
        MyMath mymath = new MyMath();
        int actual = mymath.min(0,0);
        Assert.assertEquals(0, actual);
    }
    @Test
    public void test4_min(){
        MyMath mymath = new MyMath();
        int actual = mymath.min(-10,-11);
        Assert.assertEquals(-11, actual);
    }
}