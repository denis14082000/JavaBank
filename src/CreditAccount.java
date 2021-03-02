
public class CreditAccount extends AbstractBankAccount{

    int creditLimit;
    private AccountType type;
    CreditAccount(String name, int num,int amt, AccountType type)
    {
        super(name,num,amt);
        this.creditLimit = calculateCreditLimit(amt);
        this.type = type;

    }

    //overloaded constructor for CreditAccount
    CreditAccount(String name, int num,int amt,int credit)
    {
        super(name,num,amt);
        this.creditLimit=credit;

    }

    private static int calculateCreditLimit(int amt) {
        if (amt >= 1 && amt <= 2000) {
            return 100;
        } else if (amt <= 4000){
            return 200;
        } else {
            return 300;
        }
    }

    public void deposit(int amt)
    {
        balance=balance+amt;
    }

    //modifier to set the account creditlimit
    public void setcreditlimit(int num)
    {
        creditLimit = num;
    }
    //accessor to get the account creditlimit
    public int getcreditlimit ( ) {

        return creditLimit;
    }
    public String toString() {
        return "\n\nAccount Type: " + this.type + super.toString() + "\nCredit Limit: " + creditLimit + "\n";
    }
}
