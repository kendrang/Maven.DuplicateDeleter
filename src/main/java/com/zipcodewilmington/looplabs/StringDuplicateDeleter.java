package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    public long getNumberofOccurances (String word){
        return   Arrays.stream(array)
                .filter(element -> element.equals(word))
                .count();
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {

        return Arrays.stream(array)
                .filter(word -> getNumberofOccurances(word) < maxNumberOfDuplications)
                .toArray(String[]::new);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array)
                .filter(word-> getNumberofOccurances(word) != exactNumberOfDuplications)
                .toArray(String[]::new);
    }
}
