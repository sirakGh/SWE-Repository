package edu.miu.cs.cs425.lab10;


import edu.miu.cs.cs425.lab10.prob1_utils.ArrayFlattener;
import edu.miu.cs.cs425.lab10.prob2_utils.ArrayReversor;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       


        ArrayFlattener arrayFlattener=new ArrayFlattener();
        ArrayReversor arrayReversor=new ArrayReversor();
        int[][] a = {{1, 2, 3}, {4, 5, 6, 7}};
        int[] b=arrayFlattener.flattenedArray(a);

        int[] reversed=arrayReversor.reverseArraySample(b);
        Integer[] expected={1,2,3,4,5,6,7};

            System.out.print(Arrays.toString(reversed));
    }
}
