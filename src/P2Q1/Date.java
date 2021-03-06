package P2Q1;

public class Date {
    //data fields
    private int day;
    private int month;
    private int year;

    //constructor
    public Date(){

    }

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //accessors/mutators
    public void setDay(int day){
        this.day = day;
    }

    public int getDay(){
        return day;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public int getMonth(){
        return month;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    //prints the date in d-m-y format
    public String printDate(){
        return getDay() + "-" + getMonth() + "-" + getYear();
    }


}
