
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    // part 1
    public Money plus(Money addition) {
        Money newMoney = new Money(addition.euros()+this.euros(), addition.cents()+this.cents());
        return newMoney;
      
    }
    
    // part 2
    public boolean lessThan(Money compared) {
        Money newMoney = new Money(compared.euros(), compared.cents());
        if(this.euros() < compared.euros()) {
            return true;
        } else if(this.euros() == compared.euros() && this.cents() < compared.cents()) {
            return true;
        }
        return false;
    }
    
    // part 3
    public Money minus(Money decreaser) {
        int newEuros = euros - decreaser.euros();
        int newCents = cents - decreaser.cents();
        if (newCents < 0) {
            newCents = newCents + 100;
            newEuros = newEuros - 1;
        }
        // if the value becomes negative, return zero
        if (newEuros < 0) {
            newEuros = 0;
            newCents = 0;

        }

        Money newMoney = new Money(newEuros, newCents);

        return newMoney;

    }

}
