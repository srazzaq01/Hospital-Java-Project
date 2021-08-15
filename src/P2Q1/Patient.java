package P2Q1;


public class Patient extends Person {
    //data fields
    private int patId;
    private Date DoB;
    private Doctor attPhys;
    private Date admDate;
    private Date disDate;

    //constructors
    public Patient(){
        super();
    }

    public Patient(String firstName, String lastName, int patId, Date DoB, Doctor attPhys, Date admDate, Date disDate){
        super(firstName, lastName);
        this.patId = patId;
        this.DoB = DoB;
        this.attPhys = attPhys;
        this.admDate = admDate;
        this.disDate = disDate;
    }

    //accessors/mutators
    public void setPatId(int patId){
        this.patId = patId;
    }

    public int getPatId(){
        return patId;
    }

    public void setDoB(Date DoB){
        this.DoB = DoB;
    }

    public Date getDoB(){
        return DoB;
    }

    public void setAttPhys(Doctor attPhys){
        this.attPhys = attPhys;
    }

    public Doctor getAttPhys(){
        return attPhys;
    }

    public void setAdmDate(Date admDate){
        this.admDate = admDate;
    }

    public Date getAdmDate(){
        return admDate;
    }

    public void setDisDate(Date disDate){
        this.disDate = disDate;
    }

    public Date getDisDate(){
        return disDate;
    }


}
