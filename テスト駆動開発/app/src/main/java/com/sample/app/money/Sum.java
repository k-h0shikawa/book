package com.sample.app.money;

class Sum implements Expressin {
    Expressin augend; // 加算される側
    Expressin addend; // 加算する側

    Sum(Expressin augend, Expressin addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Expressin times(int multiplier) {
        return new Sum(augend.times(multiplier), addend.times(multiplier));
    }

    public Expressin plus(Expressin addend) {
        return new Sum(this, addend);
    }

    /**
     * 加算した値を指定された通貨に変換して返す
     * @param to 変換先の通貨
     * @return 加算結果のMoneyオブジェクト
     */
    public Money reduce(Bank bank, String to) {
        int amount = this.augend.reduce(bank, to).amount 
                        + this.addend.reduce(bank, to).amount;

        return new Money(amount, to);
    }
}
