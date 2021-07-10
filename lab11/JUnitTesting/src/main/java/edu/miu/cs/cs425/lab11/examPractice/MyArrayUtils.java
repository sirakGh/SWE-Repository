package edu.miu.cs.cs425.lab11.examPractice;


import java.util.Comparator;
import java.util.stream.Stream;

public class MyArrayUtils {

    public Boolean hasMultipleMaximum(Integer[] a){
        Integer max=Stream.of(a).max(Comparator.comparing(Integer::valueOf))
                .get();
        Long x=Stream.of(a).filter(z->z==max).count();
        if(x>1)
            return true;
        return false;

    }
}
