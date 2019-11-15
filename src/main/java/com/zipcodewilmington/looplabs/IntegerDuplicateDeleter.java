package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {


    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    public long getNumberofOccurances (int num){
      return   Arrays.stream(array)
                .filter(element -> element == num)
                .count();
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
       return Arrays.stream(array)
                .filter(num -> getNumberofOccurances(num) < maxNumberOfDuplications)
                .toArray(Integer[]::new);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
       return Arrays.stream(this.array)
                .filter(num -> getNumberofOccurances(num) != exactNumberOfDuplications)
                .toArray(Integer[]::new);
    }
}
