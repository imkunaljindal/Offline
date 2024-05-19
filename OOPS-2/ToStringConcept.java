class Player {
    String name;
    int runsScored;

    public Player(String name, int runsScored) {
        this.name = name;
        this.runsScored = runsScored;
    }

//    public String toString() {
//        return "Player object printed";
//    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", runsScored=" + runsScored +
                '}';
    }
}

public class ToStringConcept {
    public static void main(String[] args) {
        Player p = new Player("Virat",47);
        System.out.println(p);

        Player p2 = new Player("Rohit",50);
        System.out.println(p2);
    }
}
