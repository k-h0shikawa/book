package com.sample.app.money;

abstract class Money {
    protected int amount;
    abstract Money times(int multiplier);
    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount && 
               this.getClass().equals(money.getClass());
    }

    static Dollar dollar(int amount) {
        return new Dollar(amount);
    }
    static Franc franc(int amount) {
        return new Franc(amount);
    }
}
