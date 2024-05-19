class Team {
    int players;
    String name;

    public Team() {
    }

    public Team(int players) {
        this.players = players;
    }

    public Team(int players, String name) {
        this(players);
        this.name = name;
    }

    public void init() {
        System.out.printf("ksaf");
    }

    public void hello() {
        this.init();
        System.out.println(this.name);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Team p = new Team(4,"ABC");
        System.out.println(p.name);
        System.out.println(p.players);
    }
}

