package Week5;
import java.util.ArrayList;

public class Ex90 {
    public static void main(String[] args) {
        // Exercise 90.1: Class Team
        Team barcelona = new Team("FC Barcelona");
        System.out.println("Team: " + barcelona.getName());

        // Exercise 90.2: Player
        Player brian = new Player("Brian");
        System.out.println("Player: " + brian);

        Player pekka = new Player("Pekka", 39);
        System.out.println("Player: " + pekka);

        // Exercise 90.3: Adding players to a team
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

        barcelona.printPlayers();

        // Exercise 90.4: The team maximum size and current size
        Team limitedTeam = new Team("Limited Team");
        limitedTeam.setMaxSize(1);

        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2", 10);

        limitedTeam.addPlayer(player1);
        limitedTeam.addPlayer(player2);
        limitedTeam.addPlayer(new Player("Player3", 5)); // won't be added

        System.out.println("Number of players: " + limitedTeam.size());

        // Exercise 90.5: Goals of a team
        Team teamWithGoals = new Team("Team With Goals");

        Player goalPlayer1 = new Player("GoalPlayer1", 20);
        Player goalPlayer2 = new Player("GoalPlayer2", 30);

        teamWithGoals.addPlayer(goalPlayer1);
        teamWithGoals.addPlayer(goalPlayer2);

        System.out.println("Total goals: " + teamWithGoals.goals());
    }
}

class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
        this.maxSize = 16; // default maximum size
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        if (this.players.size() < this.maxSize) {
            this.players.add(player);
        }
    }

    public void printPlayers() {
        for (Player player : this.players) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.players.size();
    }

    public int goals() {
        int totalGoals = 0;
        for (Player player : this.players) {
            totalGoals += player.goals();
        }
        return totalGoals;
    }
}

class Player {
    private String name;
    private int goals;

    public Player(String name) {
        this.name = name;
        this.goals = 0;
    }

    public Player(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }

    public String getName() {
        return this.name;
    }

    public int goals() {
        return this.goals;
    }

    @Override
    public String toString() {
        return this.name + ", goals " + this.goals;
    }
}
