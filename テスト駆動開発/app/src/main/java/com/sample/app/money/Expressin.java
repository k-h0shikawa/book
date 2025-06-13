package com.sample.app.money;

public interface Expressin {

    Expressin plus(Expressin addend);
    Money reduce(Bank bank, String to);

}
