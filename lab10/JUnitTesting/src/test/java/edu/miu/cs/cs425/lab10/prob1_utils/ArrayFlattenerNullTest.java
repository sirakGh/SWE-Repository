package edu.miu.cs.cs425.lab10.prob1_utils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.miu.cs.cs425.lab10.prob1_utils.ArrayFlattener;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArrayFlattenerNullTest {

    private ArrayFlattener arrayFlattener;

    @Before
    public void setUp() throws Exception{
        this.arrayFlattener=new ArrayFlattener();
    }

    @After
    public void tearDown() throws Exception{
        this.arrayFlattener=null;
    }

    @Test
    public void testNullFlattenedArray(){
        int[][] input = null;
        int[] expected= null;
        int[] actual=this.arrayFlattener.flattenedArray(input);
        assertArrayEquals(expected,actual);
    }
}
