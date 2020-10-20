package labsheet9.exercise1;

public final class selfEmployedWorker extends Employee {
    private double estimatedIncome;

    public selfEmployedWorker(String firstName, String lastName) {
        super(firstName, lastName);
        setEstimatedIncome();
    }

    public void setEstimatedIncome() {
        this.estimatedIncome = (int)(Math.random()*500+400);
    }

    public double earnings(){
        return estimatedIncome;
    }

    public String toString(){
        return "Self-employed workers name is " +  super.toString();
    }

}
