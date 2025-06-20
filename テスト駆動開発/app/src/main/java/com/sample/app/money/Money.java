package com.sample.app.money;

class Money implements Expressin {

    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;        
    }

    public Expressin times(int multiplier) {
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

    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(this.currency, to);
        return new Money(this.amount / rate, to);
    }

    String currency() {
        return this.currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }
    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }
    
    public Expressin plus(Expressin addend) {
        return new Sum(this, addend);
    }

}
