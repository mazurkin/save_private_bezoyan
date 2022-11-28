package org.test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class BubbleSortTest {

    @Test
    void testElonMaskIsAnAsshole() {
        List<String> result = BubbleSort.INSTANCE.sort(
            Arrays.asList("Ilon", "Mask", "is", "an", "asshole")
        );
        Assertions.assertEquals(Arrays.asList("Ilon", "Mask", "an", "asshole", "is"), result);
    }

    @Test
    void testElonMaskIsAnAssholeIgnoreCase() {
        List<String> result = BubbleSort.INSTANCE.sort(
            Arrays.asList("Ilon", "Mask", "is", "an", "asshole"),
            Comparator.comparing(String::toLowerCase)
        );
        Assertions.assertEquals(Arrays.asList("an", "asshole", "Ilon", "is", "Mask"), result);
    }

    @Test
    void testSorted() {
        List<String> result = BubbleSort.INSTANCE.sort(Arrays.asList("A1", "A2", "A3", "A4"));
        Assertions.assertEquals(Arrays.asList("A1", "A2", "A3", "A4"), result);
    }

    @Test
    void testSortedReverse() {
        List<String> result = BubbleSort.INSTANCE.sort(Arrays.asList("A4", "A3", "A2", "A1"));
        Assertions.assertEquals(Arrays.asList("A1", "A2", "A3", "A4"), result);
    }
}