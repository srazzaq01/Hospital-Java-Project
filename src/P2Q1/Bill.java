package P2Q1;

public class Bill {
    //data fields
    private int ID;
    private double pCharges;
    private double dFee;
    private double rCharges;

    //constructors
    public Bill(){

    }

    public Bill(int argID, double pCharges, double dFee, double rCharges){
        ID = argID;
        this.pCharges = pCharges;
        this.dFee = dFee;
        this.rCharges = rCharges;
    }

    //accessors/mutators
    public void setID(int argID){
        ID = argID;
    }

    public int getID(){
        return ID;
    }

    public void setPCharges(double pCharges){
        this.pCharges = pCharges;
    }

    public double getPCharges(){
        return pCharges;
    }

    public void setDFee(double dFee){
       this.dFee = dFee;
    }

    public double getDFee(){
        return dFee;
    }

    public void setRCharges(double rCharges){
        this.rCharges = rCharges;
    }

    public double getRCharges(){
        return rCharges;
    }

    //method to print all of the charges
    public String printCharges(){
        return "Pharmacy charges: " + "$" + getPCharges() + "\n" +
                "Room charges: " + "$" + getRCharges() + "\n" +
                "Doctor's fees: " + "$" + getDFee() + "\n" +
                "--------------------" + "\n" +
                "Total charges: " + "$" + (getPCharges() + getRCharges() + getDFee());

    }



}
