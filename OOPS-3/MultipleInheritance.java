interface ICT {
    void play();
}

interface RCB {
    void play();
}

interface Brand {
    String getBrandName();
}

class Kohli implements ICT,RCB,Brand {
    public void play() {
        System.out.println("Kohli is playing");
    }

    public String getBrandName() {
        return "";
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Kohli kohli = new Kohli();
        kohli.play();
    }
}
