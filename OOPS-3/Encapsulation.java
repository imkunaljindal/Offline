import Marvel.IronMan;

class BankAccount {
    private int balance;
    // getter
    public int getBalance() {
        return this.balance;
    }

    // setter
    public void setBalance(int balance) {
        if(balance <= 10000) {
          this.balance = balance;
        }
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        BankAccount kunalAccount = new BankAccount();
        kunalAccount.setBalance(5000);
        System.out.println(kunalAccount.getBalance());
        IronMan ironMan = new IronMan();
        ironMan.arcReactor = 1000;
    }
}
