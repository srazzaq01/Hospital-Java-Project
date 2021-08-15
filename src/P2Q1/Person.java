package P2Q1;

public class Person {
    //data fields
    private String firstName;
    private String lastName;

    //constructors
    public Person(){

    }

    public Person(String argFirstName, String argLastName){
        firstName = argFirstName;
        lastName = argLastName;
    }

    //accessors/mutators
    public void setFirstName(String argFirstName){
        firstName = argFirstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String argLastName){
        lastName = argLastName;
    }

    public String getLastName(){
        return lastName;
    }

    //method to print the name
    public String printName(){
        return firstName + " " + lastName;
    }

}
