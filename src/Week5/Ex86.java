package Week5;

public class Ex86 {
    public static class LyyraCard {
        private double balance;

        public LyyraCard(double balance) {
            this.balance = balance;
        }

        public double balance() {
            return this.balance;
        }

        public void loadMoney(double amount) {
            this.balance += amount;
        }

        public boolean pay(double amount) {
            if (this.balance >= amount) {
                this.balance -= amount;
                return true;
            }
            return false;
        }
    }

    public static class CashRegister {
        private double cashInRegister;   // the amount of cash in the register
        private int economicalSold;      // the amount of economical lunches sold
        private int gourmetSold;         // the amount of gourmet lunches sold

        public CashRegister() {
            this.cashInRegister = 1000.0;
        }

        public double payEconomical(double cashGiven) {
            double lunchPrice = 2.50;
            if (cashGiven >= lunchPrice) {
                this.cashInRegister += lunchPrice;
                this.economicalSold++;
                return cashGiven - lunchPrice;
            }
            return cashGiven;
        }

        public double payGourmet(double cashGiven) {
            double lunchPrice = 4.00;
            if (cashGiven >= lunchPrice) {
                this.cashInRegister += lunchPrice;
                this.gourmetSold++;
                return cashGiven - lunchPrice;
            }
            return cashGiven;
        }

        public boolean payEconomical(LyyraCard card) {
            double lunchPrice = 2.50;
            if (card.pay(lunchPrice)) {
                this.economicalSold++;
                return true;
            }
            return false;
        }

        public boolean payGourmet(LyyraCard card) {
            double lunchPrice = 4.00;
            if (card.pay(lunchPrice)) {
                this.gourmetSold++;
                return true;
            }
            return false;
        }

        public void loadMoneyToCard(LyyraCard card, double sum) {
            if (sum > 0) {
                card.loadMoney(sum);
                this.cashInRegister += sum;
            }
        }

        public String toString() {
            return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
        }
    }

    public static void main(String[] args) {
        CashRegister unicafeExactum = new CashRegister();

        double theChange = unicafeExactum.payEconomical(10);
        System.out.println("the change was " + theChange);

        theChange = unicafeExactum.payEconomical(5);
        System.out.println("the change was " + theChange);

        theChange = unicafeExactum.payGourmet(4);
        System.out.println("the change was " + theChange);

        System.out.println(unicafeExactum);

        // Exercise 86.3: Paying with card
        LyyraCard cardOfJim = new LyyraCard(7);

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);
        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);
        succeeded = unicafeExactum.payEconomical(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println(unicafeExactum);

        // Exercise 86.4: Loading money
        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        unicafeExactum.loadMoneyToCard(cardOfJim, 100);

        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        System.out.println(unicafeExactum);
    }
}
