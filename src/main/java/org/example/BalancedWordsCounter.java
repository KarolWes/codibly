package org.example;

import java.util.HashMap;

public class BalancedWordsCounter {
    public static int count(String input){
        int res = 0;
        if(input == null){
            throw new RuntimeException();
        }
        else{
            // check if contains non-alpha
            for(int i = 0; i < input.length(); i++){
                if(input.charAt(i) < 'a' || input.charAt(i) > 'z'){
                    throw new RuntimeException();
                }
            }

            for(int left = 0; left < input.length(); left++){
                HashMap<Character, Integer> dict = new HashMap<>();
                int maxi = 1;
                for(int j = left; j < input.length(); j++) {
                    var c = input.charAt(j);
                    if (dict.containsKey(c)) {
                        var new_val = (int) dict.get(c);
                        new_val ++;
                        maxi = Math.max(maxi, new_val);
                        dict.put(c, new_val);
                    } else {
                        dict.put(c, 1);
                    }
                    // check if balanced
                    int mini = dict.values().stream().min(Integer::compare).get();
                    if(mini == maxi){
                        res ++;
                    }
                }
            }
        }
        return res;
    }
}
