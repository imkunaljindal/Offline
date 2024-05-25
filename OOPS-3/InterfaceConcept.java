interface Bank {
    double repoRate = 7.3;
    double getRateOfInterest();
    void welcome(String name);
}

interface SimpleBank extends Bank {
    String getAddress();
}

class SBI implements SimpleBank {
    String address;
    public void random() {
        System.out.println("Printing anything random");
    }

    public double getRateOfInterest() {
        return 6.7;
    }
    public void welcome(String name) {
        System.out.println(name + " Welcome to SBI");
    }

    public String getAddress() {
        return "New Delhi";
    }
}

class HDFC implements Bank {
    public double getRateOfInterest() {
        return 7.1;
    }

    public void welcome(String name) {
        System.out.println(name + " welcome to HDFC");
    }
}

public class InterfaceConcept {
    public static void main(String[] args) {
    }
}
