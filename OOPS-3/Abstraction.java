abstract class Player {
    int runs;
    public Player() {
        System.out.println("Player constructor called");
    }
    void play() {
        System.out.println("Player is playing");
    }
    abstract String register(String name);
    abstract void printTeamName();
}

class CricketPlayer extends Player {

    public CricketPlayer() {
        System.out.println("Cricket Player constructor called");
    }

    int runs;
    void printRuns() {
        System.out.println(runs);
    }

    String register(String name) {
        return name + " has been registered";
    }

    void printTeamName() {
        System.out.println("Team name is RCB");
    }
}

public class Abstraction {
    public static void main(String[] args) {
//        Player p = new Player();
//        p.play();
//        p.register("kunal");

//        Player p = new Player();
//        p.register("Virat");
        CricketPlayer cricketPlayer = new CricketPlayer();
//        cricketPlayer.play();
//            System.out.println(cricketPlayer.register("Virat"));
    }
}
