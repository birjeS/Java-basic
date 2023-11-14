package Week7;

import java.util.HashMap;

public class Ex6 {
    public static void main(String[] args) {
        // Create a PromissoryNote
        PromissoryNote mattisNote = new PromissoryNote();

        // Set loans
        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Mikael", 30);

        // Print debts
        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
        System.out.println(mattisNote.howMuchIsTheDebt("Joel"));

        // Test old loan cancellation
        mattisNote.setLoan("Arto", 10.5);
        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
    }
}

class PromissoryNote {
    private HashMap<String, Double> loans;

    public PromissoryNote() {
        this.loans = new HashMap<>();
    }

    public void setLoan(String toWhom, double value) {
        // Set a new loan or update an existing one
        this.loans.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {
        // Return the debt of the specified person, or 0 if not found
        return this.loans.getOrDefault(whose, 0.0);
    }
}
