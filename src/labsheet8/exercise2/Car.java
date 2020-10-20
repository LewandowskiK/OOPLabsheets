package labsheet8.exercise2;

public class Car extends Vehicle {
    private int maxPassengers;
    private String registrationNumber;

    public Car(){
        setMaxPassengers(0);
        setRegistrationNumber("No registration number specified");
    }

    public Car(double price, double length, double height, double weight,
               String manufacturer, String model, int maxPassengers,
               String registrationNumber) {
        super(price, length, height, weight, manufacturer, model);
        setMaxPassengers(maxPassengers);
        setRegistrationNumber(registrationNumber);
    }

    //Getters
    public int getMaxPassengers() {
        return maxPassengers;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    //Setters
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
    public void setRegistrationNumber(String registrationNumber) {
        if(isValidRegNumber(registrationNumber))
            this.registrationNumber = registrationNumber;
        else
            this.registrationNumber = "Invalid Registration Number";
    }
    //Validation
    public boolean isValidRegNumber(String registrationNumber){
        if(registrationNumber.length()>=6&&registrationNumber.length()<=12)
            if(Character.isDigit(registrationNumber.charAt(0))&&
               Character.isDigit(registrationNumber.charAt(1))&&
               registrationNumber.charAt(2)=='-')
                if((Character.isLetter(registrationNumber.charAt(3))&&
                    Character.isLetter(registrationNumber.charAt(4))&&
                        registrationNumber.charAt(5)=='-')||(Character.isLetter(registrationNumber.charAt(3))&&
                        registrationNumber.charAt(4)=='-')){
                    if(registrationNumber.charAt(4)=='-'){
                        if(registrationNumber.length()<=11)
                            for (int i = 5; i < registrationNumber.length(); i++){
                                if(!Character.isDigit(registrationNumber.charAt(i)))
                                    return false;
                            }
                            return true;
                    }
                    else {
                        for (int i = 6; i < registrationNumber.length(); i++) {
                            if(!Character.isDigit(registrationNumber.charAt(i)))
                                return false;
                        }
                        return true;
                    }
                }
        return false;
    }

    @Override
    public String toString(){
        return super.toString() + "\nMax number of passengers: " + getMaxPassengers() +
                "\nRegistration Number: " + getRegistrationNumber();
    }
}
