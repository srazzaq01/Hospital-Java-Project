package P2Q1;
import java.util.*;
import java.io.*;


public class TestPatient {
    public static void main(String[] args) throws IOException{
        //input stream
        Scanner input = new Scanner(System.in);

        //creating 3 Date objects that will go in to the Patient constructor
        Date DoB = new Date(6, 3, 2001);
        Date admDate = new Date(11, 9, 2020);
        Date disDate = new Date(12, 9, 2020);

        //user inputs date for patient id and name, as well as doctor name and specialty
        System.out.print("Enter patient's ID: ");
        int patID = input.nextInt();

        System.out.print("Enter patient's first name: ");
        String firstName = input.next();

        System.out.print("Enter patient's last name: ");
        String lastName = input.next();

        System.out.print("Enter doctor's first name: ");
        String docFirstName = input.next();

        System.out.print("Enter doctor's last name: ");
        String docLastName = input.next();

        System.out.print("Enter doctor's specialty: ");
        String specialty = input.next();

        //creating a doctor object
        Doctor d2 = new Doctor(docFirstName, docLastName, specialty);

        //creating patient object with user info and date/doctor objects as parameters for constructor
        Patient p3 = new Patient(firstName, lastName, patID, DoB, d2, admDate, disDate);

        //printing all information using patient object
        System.out.print("Patient: " + p3.printName() + "\n");
        System.out.print("Attending Physician: " + p3.getAttPhys().printName() + " " + p3.getAttPhys().getSpecialty()
        + "\n");
        System.out.print("Admit date: " + p3.getAdmDate().printDate() + "\n");
        System.out.print("Discharge date: " + p3.getDisDate().printDate() + "\n");

        //creating bill object and printing charges
        Bill b1 = new Bill(patID, 245.5, 3500.38, 2500);
        System.out.println(b1.printCharges());

        //creating file object
        File file = new File(p3.getFirstName()+p3.getLastName()+".txt");

        //creating printwriter object
        PrintWriter output = new PrintWriter(file);

        //using printwrite to print to .txt
        output.print("Patient: " + p3.printName() + "\n");
        output.print("Attending Physician: " + p3.getAttPhys().printName() + " " + p3.getAttPhys().getSpecialty()
                + "\n");
        output.print("Admit date: " + p3.getAdmDate().printDate() + "\n");
        output.print("Discharge date: " + p3.getDisDate().printDate() + "\n");
        output.print(b1.printCharges());
        output.close();











    }
}
