package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BalancedWordsCounterTest {
    @Test
    void test_count(){
        String input = "aabbabcccba";
        int correct = 28;
        int output = BalancedWordsCounter.count(input);
        assertEquals(correct, output, "Error while counting normal input");
    }

    @Test
    void test_count_empty(){
        String input = "";
        int correct = 0;
        int output = BalancedWordsCounter.count(input);
        assertEquals(correct, output, "Error while counting normal input");
    }

    @Test
    void test_count_throw_non_alpha(){
        assertThrows(RuntimeException.class, ()-> BalancedWordsCounter.count("abababa1"));
    }
    @Test
    void test_count_throw_null_input(){
        assertThrows(RuntimeException.class, ()-> BalancedWordsCounter.count(null));
    }

}