package com.sample.app.money;

abstract class Money {
    protected int amount;
    abstract Money times(int multiplier);
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;        
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount && 
               this.getClass().equals(money.getClass());
    }

    String currency() {
        return this.currency;
    }

    static Dollar dollar(int amount) {
        return new Dollar(amount, "USD");
    }
    static Franc franc(int amount) {
        return new Franc(amount, "CHF");
    }
}
