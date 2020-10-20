package labsheet6.exercise1;

public class Person {
    private String firstName;
    private String lastName;

    public Person(){
        this.firstName = "Not Supplied";
        this.lastName = "Not Supplied";
    }
    public Person(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }

    @Override
    public String toString() {
        return "First Name: " + getFirstName() + "  Last Name: " + getLastName() +"\n\n";
    }
}
