package labsheet5.exercise5;

public class BankAccount {
    private String owner;
    private static int number;
    private static double interest;
    public BankAccount(){
        this("Owner not available",0);
    }

    public BankAccount(String owner, double interest){
        setOwner(owner);
        incrementNumber();
        setNumber(number);
        setInterestRate(interest);
    }

    public static int getNumber() {
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
    public static void setNumber(int number) {
        BankAccount.number = number;
    }
    public static void setInterestRate(double interest) {
        BankAccount.interest = interest;
    }

    private static void incrementNumber(){
        number++;
    }

    @Override
    public String toString() {
        return "\n\nOwner: " + getOwner() + "  Account Number: " + getNumber() +
                " Interest rate: " + getInterest() + "\n\n";
    }
}
