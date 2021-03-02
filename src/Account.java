
public class Account extends AbstractBankAccount{

    // class variables
    private int bonusValue;
    private AccountType type;

    public Account(String name, int num, int amt, AccountType type) {
        super(name, num, (amt + calculateInitialBonusValue(amt)));
        this.type = type;
    }
    //Казанцев Денис

    private static int calculateInitialBonusValue(int amt) {
        if (amt >= 1 && amt <= 100) {
            return 10;
        } else if (amt <= 300){
            return 20;
        } else {
            return 30;
        }
    }

    public void deposit(int amt)
    {
        if (amt > 100) {
            balance = balance + (amt + (int)(bonusValue * 0.1));
        } else {
            balance=balance+amt;
        }
    }

    //Казанцев Денис Ильич
    //print method
    public String toString() {
        return "\nAccount Type: " + this.type + super.toString();
    }
}
