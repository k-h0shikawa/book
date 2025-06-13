package com.sample.app.money;

class Sum implements Expressin {
    Money augend; // 加算される側
    Money addend; // 加算する側

    Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    /**
     * 加算した値を指定された通貨に変換して返す
     * @param to 変換先の通貨
     * @return 加算結果のMoneyオブジェクト
     */
    public Money reduce(Bank bank, String to) {
        int amount = this.augend.amount + this.addend.amount;
        return new Money(amount, to);
    }
}
