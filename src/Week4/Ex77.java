package Week4;

public class Ex77 {
    private double balance;

    public Ex77(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        if (this.balance >= 2.50) {
            this.balance -= 2.50;
        }
    }

    public void payGourmet() {
        if (this.balance >= 4.00) {
            this.balance -= 4.00;
        }
    }

    public void loadMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;
            // Truncate the balance to 150 euros if it exceeds the limit
            if (this.balance > 150.00) {
                this.balance = 150.00;
            }
        }
    }

    public static void main(String[] args) {
        Ex77 card = new Ex77(50);
        System.out.println(card);

        card.payEconomical();
        System.out.println(card);

        card.payGourmet();
        card.payEconomical();
        System.out.println(card);

        Ex77 anotherCard = new Ex77(5);
        System.out.println(anotherCard);

        anotherCard.payGourmet();
        System.out.println(anotherCard);

        anotherCard.payGourmet();
        System.out.println(anotherCard);

        Ex77 thirdCard = new Ex77(10);
        System.out.println(thirdCard);

        thirdCard.loadMoney(15);
        System.out.println(thirdCard);

        thirdCard.loadMoney(10);
        System.out.println(thirdCard);

        thirdCard.loadMoney(200);
        System.out.println(thirdCard);

        thirdCard.loadMoney(-15);
        System.out.println(thirdCard);

        Ex77 cardPekka = new Ex77(20);
        Ex77 cardBrian = new Ex77(30);

        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

        cardPekka.payGourmet();
        cardBrian.payEconomical();

        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

        cardPekka.loadMoney(20);
        cardBrian.payGourmet();

        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50);

        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
    }
}
