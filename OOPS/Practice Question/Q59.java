// Q59: Team copy constructor - clone roster before changes
class Team {
    String[] players;
    String[] positions;

    Team(String[] players, String[] positions) {
        this.players = players;
        this.positions = positions;
    }

    Team(Team other) {
        players = new String[other.players.length];
        positions = new String[other.positions.length];
        for (int i = 0; i < other.players.length; i++) {
            players[i] = other.players[i];
            positions[i] = other.positions[i];
        }
    }

    void display(String label) {
        System.out.println(label + ":");
        for (int i = 0; i < players.length; i++) {
            System.out.println("  " + players[i] + " - " + positions[i]);
        }
    }
}

public class Q59 {
    public static void main(String[] args) {
        Team main = new Team(new String[] { "Amit", "Riya" }, new String[] { "Striker", "Goalkeeper" });
        Team experiment = new Team(main);
        experiment.positions[0] = "Defender";      // experimental change
        main.display("Main team");
        experiment.display("Experimental team");
    }
}
