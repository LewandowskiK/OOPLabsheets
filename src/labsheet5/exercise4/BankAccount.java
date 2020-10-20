package labsheet5.exercise4;

public class BankAccount {
    private String owner;
    private int number;
    private static double interest;
    public BankAccount(){
        this("Owner not available",0,0);
    }

    public BankAccount(String owner, int number, double interest){
        setOwner(owner);
        setNumber(number);
        setInterestRate(interest);
    }

    public int getNumber() {
        return number;
    }
    public double getInterest() {
        return interest;
    }
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public static void setInterestRate(double interest) {
        BankAccount.interest = interest;
    }

    @Override
    public String toString() {
        return "\n\nOwner: " + getOwner() + "  Account Number: " + getNumber() +
                " Interest rate: " + getInterest() + "\n\n";
    }
}
