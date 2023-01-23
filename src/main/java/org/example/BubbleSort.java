package org.example;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    public static List<Number> sort(List input){
        ArrayList<Number> clean = new ArrayList<>();
        if (input == null){
            throw new RuntimeException();
        }
        else{
            // remove null values
            for (var el: input){
                if(el != null){
                    clean.add((Number) el);
                }
            }
            // simple cases
            if(clean.size() <= 1){
                return clean;
            }
            else{
                boolean change = true;
                int len = clean.size();
                while(change){
                    change = false;
                    for(int i = 0; i < len-1; i++){
                        if(clean.get(i).doubleValue() > clean.get(i + 1).doubleValue()){
                            var tmp = clean.get(i+1);
                            clean.set(i+1, clean.get(i));
                            clean.set(i, tmp);
                            change = true;
                        }
                    }
                }
            }
        }
        return clean;
    }
}
