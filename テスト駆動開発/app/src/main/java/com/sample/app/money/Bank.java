package com.sample.app.money;

import java.util.HashMap;
import java.util.Map;

/**
 * Bankクラスは通貨の変換を行うクラス
 */
public class Bank {

    private Map<Pair, Integer> rates = new HashMap<>();

    Money reduce(Expressin source, String to) {
        return source.reduce(this, to);
    }

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }

    int rate(String from, String to) {
        if(from.equals(to)) {
            return 1;
        }
        return rates.get(new Pair(from, to));
    }

}
