package Week6;

public class Ex95 {
    public static void main(String[] args) {
        // Exercise 95.1: Plus
        Money a = new Money(10, 0);
        Money b = new Money(5, 0);

        Money c = a.plus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

        a = a.plus(c);

        System.out.println(a);  // 25.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

        // Exercise 95.2: Less
        Money x = new Money(10, 0);
        Money y = new Money(3, 0);
        Money z = new Money(5, 0);

        System.out.println(x.less(y));  // false
        System.out.println(y.less(z));  // true

        // Exercise 95.3: Minus
        Money p = new Money(10, 0);
        Money q = new Money(3, 50);

        Money r = p.minus(q);

        System.out.println(p);  // 10.00e
        System.out.println(q);  // 3.50e
        System.out.println(r);  // 6.50e

        r = r.minus(p);

        System.out.println(p);  // 10.00e
        System.out.println(q);  // 3.50e
        System.out.println(r);  // 0.00e
    }
}

class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int newEuros = this.euros + added.euros;
        int newCents = this.cents + added.cents;

        if (newCents > 99) {
            newEuros += newCents / 100;
            newCents %= 100;
        }

        return new Money(newEuros, newCents);
    }

    public boolean less(Money compared) {
        return (this.euros < compared.euros) || (this.euros == compared.euros && this.cents < compared.cents);
    }

    public Money minus(Money decremented) {
        int newEuros = this.euros - decremented.euros;
        int newCents = this.cents - decremented.cents;

        if (newCents < 0) {
            newEuros--;
            newCents += 100;
        }

        if (newEuros < 0) {
            newEuros = 0;
            newCents = 0;
        }

        return new Money(newEuros, newCents);
    }
}
