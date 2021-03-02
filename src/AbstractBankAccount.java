public abstract class AbstractBankAccount {
    public final String BANK = "JavaBank";

    protected String accountname;
    protected int accountnum;
    protected int balance;


    public AbstractBankAccount(String name, int num,int amt)
    {
        accountname=name;
        accountnum=num;
        balance=amt;
    }

    public void deposit(int amt)
    {
        balance=balance+amt;
    }
    //make a withdrawal from the balance
    public void withdraw(int amt)
    {
        balance=balance-amt;
    }


    //modifier to set the accountname
    public void setaccountname(String name)
    {
        accountname = name;
    }
    //modifier to set the accountnumber
    public void setaccountnum(int num)
    {
        accountnum = num;
    }
    //modifier to set the balance
    public void setbalance(int num)
    {
        balance = num;
    }
    //accessor to get the accountname
    public String getaccountname ( ) {

        return accountname;
    }

    //accessor to get the accountnumber
    public int getaccountnum ( ) {

        return accountnum;
    }
    //accessor to get the account balance
    public int getbalance ( ) {

        return balance;
    }

    public String getBankName() {
        return BANK;
    }

    public String toString() {
        return "\n\nBank Name         : " + getBankName() +
                "\nAccount Holder    : " + accountname +
                "\nAccount Number    : " + accountnum +
                "\nAccount Balance   : " + balance;
    }
    //Казанцев Денис Ильич
}
