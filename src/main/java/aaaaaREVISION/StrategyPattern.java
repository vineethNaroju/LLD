package aaaaaREVISION;


import java.util.HashMap;
import java.util.Map;

public class StrategyPattern {

    public static void main(String[] args) {
        StrategyPattern sp = new StrategyPattern();
        sp.demo();
    }


    public void demo() {
        Map<String, String> mp = new HashMap<>();

        for(int i=0; i<10; i++) {
            mp.put(String.valueOf(i), String.valueOf(i));
        }



    }
}
