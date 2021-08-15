package P2Q1;

public class Doctor extends Person{
    //data fields
    private String specialty;

    //constructors
    public Doctor(){
        super();
    }

    public Doctor(String firstName, String lastName, String argSpecialty){
        super(firstName, lastName);
        specialty = argSpecialty;
    }

    //accessors/mutators
    public void setSpecialty(String argSpecialty){
        specialty = argSpecialty;
    }

    public String getSpecialty(){
        return specialty;
    }
}
