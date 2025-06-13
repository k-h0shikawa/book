package com.sample.app.money;

public interface Expressin {
    Expressin times(int multiplier);
    Expressin plus(Expressin addend);
    Money reduce(Bank bank, String to);
}
