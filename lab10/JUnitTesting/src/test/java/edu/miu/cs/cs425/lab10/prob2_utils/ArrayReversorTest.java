package edu.miu.cs.cs425.lab10.prob2_utils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.miu.cs.cs425.lab10.prob1_utils.ArrayFlattener;
import edu.miu.cs.cs425.lab10.prob2_utils.ArrayReversor;
import edu.miu.cs.cs425.lab10.prob2_utils.IArrayFlattenerService;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.isA;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.mockito.Mockito.*;

public class ArrayReversorTest {
    private ArrayReversor arrayReversor;
    private IArrayFlattenerService arrayFlattenerService= mock(IArrayFlattenerService.class);

    //stub
    private IArrayFlattenerService arrayFlattenerService2=new IArrayFlattenerService() {
        @Override
        public int[] flattenArray(int[][] input) {
            return Stream.of(input).flatMapToInt(row -> IntStream.of(row))
                    .toArray();
        }
    };

    @Before
    public void setUp() throws Exception{
        this.arrayReversor=new ArrayReversor(arrayFlattenerService);
    }

    @After
    public void tearDown() throws Exception{
        this.arrayReversor=null;
    }

    @Test
    public void testFlattenedArray(){
        int[][] input = {{1, 3},{0}, {4, 5, 9}};
        when(arrayFlattenerService.flattenArray(input)).thenReturn(new int[]{1,2,3,4,5,6,7});
        int[] expected={7,6,5,4,3,2,1};
        int[] actual=this.arrayReversor.reverseArray(input);
//        assertEquals(Arrays.toString(expected),Arrays.toString(actual));
        assertArrayEquals(expected,actual);
        verify(arrayFlattenerService).flattenArray(input);
//        assertThat(actual, is(expected));
    }
}
