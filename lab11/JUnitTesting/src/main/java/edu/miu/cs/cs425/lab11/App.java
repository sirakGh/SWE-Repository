package edu.miu.cs.cs425.lab11;

import edu.miu.cs.cs425.lab11.examPractice.MyArrayUtils;
import edu.miu.cs.cs425.lab11.question1_utils.ArrayFlattener;
import edu.miu.cs.cs425.lab11.question2_utils.ArrayReversor;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MyArrayUtils myArrayUtils=new MyArrayUtils();
        boolean max=myArrayUtils.hasMultipleMaximum(new Integer[]{2, 4, 3,6,7, 1, 6, 5});
        System.out.println(max);


        ArrayFlattener arrayFlattener=new ArrayFlattener();
        ArrayReversor arrayReversor=new ArrayReversor();
        int[][] a = {{1, 2, 3}, {4, 5, 6, 7}};
        int[] b=arrayFlattener.flattenedArray(a);
//        Arrays.stream(b).forEach(System.out::println);
        int[] reversed=arrayReversor.reverseArraySample(b);
        Integer[] expected={1,2,3,4,5,6,7};
//        for(int i :b)
            System.out.print(Arrays.toString(reversed));
    }
}
