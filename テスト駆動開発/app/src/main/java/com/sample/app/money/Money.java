package com.sample.app.money;

class Money {
    protected int amount;
    
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;        
    }

    public Money times(int multiplier) {
        return new Money(this.amount * multiplier, currency);
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount && 
               this.currency().equals(money.currency());
    }

    public String toString() {
        return this.amount + " " + this.currency;
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
