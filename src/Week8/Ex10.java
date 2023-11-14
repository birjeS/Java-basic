package Week8;

public class Ex10 {
    public static void main(String[] args) {
        // Test your code here!
        CivilService civilService = new CivilService();
        MilitaryService militaryService = new MilitaryService(100);

        // Example usage
        System.out.println("Civil Service Days Left: " + civilService.getDaysLeft());
        civilService.work();
        System.out.println("After working: " + civilService.getDaysLeft());

        System.out.println("Military Service Days Left: " + militaryService.getDaysLeft());
        militaryService.work();
        System.out.println("After working: " + militaryService.getDaysLeft());
    }
}

interface NationalService {
    int getDaysLeft();
    void work();
}

class CivilService implements NationalService {
    private int daysLeft = 362;

    public int getDaysLeft() {
        return daysLeft;
    }

    public void work() {
        if (daysLeft > 0) {
            daysLeft--;
        }
    }
}

class MilitaryService implements NationalService {
    private int daysLeft;

    public MilitaryService(int days) {
        this.daysLeft = days;
    }

    public int getDaysLeft() {
        return daysLeft;
    }

    public void work() {
        if (daysLeft > 0) {
            daysLeft--;
        }
    }
}
