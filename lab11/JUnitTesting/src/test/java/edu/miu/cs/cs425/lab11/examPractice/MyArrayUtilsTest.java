package edu.miu.cs.cs425.lab11.examPractice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyArrayUtilsTest {

    private MyArrayUtils myArrayUtils;

    @Before
    public void setUp() throws Exception{
        this.myArrayUtils=new MyArrayUtils();
    }

    @After
    public void tearDownq() throws Exception{
        this.myArrayUtils=null;
    }

    @Test
    public void tearDown() throws Exception {
        Integer[] input = new Integer[]{2, 4, 3,6,7, 1, 6, 5};
        boolean expected= false;
      boolean actual=this.myArrayUtils.hasMultipleMaximum(input);
        assertEquals(actual,expected);
    }
}