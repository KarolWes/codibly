package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void test_sort_ints() {
        var input =  Arrays.asList(1,4,5,6,8,3,8);
        var correct =  Arrays.asList(1,3,4,5,6,8,8);
        var output = BubbleSort.sort(input);
        assertArrayEquals(correct.toArray(), output.toArray(), "error while sorting an array of ints");
    }
    @Test
    void test_sort_various_types() {
        var input =  Arrays.asList(-9.3,0.2,4,0.1,5,9);
        var correct =  Arrays.asList(-9.3,0.1,0.2,4,5,9);
        var output = BubbleSort.sort(input);
        assertArrayEquals(correct.toArray(), output.toArray(), "error while sorting an array of various types");
    }
    @Test
    void test_sort_empty_list() {
        var input = List.of();
        var correct = List.of();
        var output = BubbleSort.sort(input);
        assertArrayEquals(correct.toArray(), output.toArray(), "error while sorting an empty array");
    }
    @Test
    void test_sort_list_with_nulls() {
        var input =  Arrays.asList(null,5.0001);
        var correct = List.of(5.0001);
        var output = BubbleSort.sort(input);
        assertArrayEquals(correct.toArray(), output.toArray(), "error while sorting an array with nulls");
    }
    @Test
    void test_sort_null_exception() {
        assertThrows(RuntimeException.class, ()->BubbleSort.sort(null));
    }
}