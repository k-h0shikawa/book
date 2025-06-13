package com.sample.app.money;

/**
 * Bankクラスは通貨の変換を行うクラス
 */
public class Bank {

    Money reduce(Expressin source, String to) {
        return source.reduce(to);
    }

}
