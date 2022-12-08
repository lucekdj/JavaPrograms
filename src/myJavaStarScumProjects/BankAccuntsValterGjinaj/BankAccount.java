package myJavaStarScumProjects.BankAccuntsValterGjinaj;


public class BankAccount  {
    final String name;
    private double balance;
    public BankAccount(String name){
        this.name = name;
        balance =0.0;
    }
    public double getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println(name + " has $" + balance);
    }
    public void withdraw(double amount){
        if (amount <= balance){
            balance = balance - amount;
            System.out.println(name + " has $" + balance);
        }else {
            System.out.println("Withdrawal by " + name + " is declined.");
        }

    }
    public void transfer(double amount, BankAccount acc){
        if (this.balance < amount){
            System.out.println("Transfer failed");
        }else {
            this.balance = balance - amount;
            acc.balance = balance + amount;
            System.out.println("Account of " + this.name + " has now $" + this.balance);
            System.out.println("Account of " + acc.name + " has now $" + acc.balance);
        }
    }
}
