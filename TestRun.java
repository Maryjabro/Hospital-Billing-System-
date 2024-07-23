import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestHospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char proceed = 'y';

        while (proceed == 'y') {
            // Get patient's information
            System.out.print("Enter patient's ID: ");
            int patientID = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            System.out.print("Enter patient's first name: ");
            String patientFirstName = scanner.nextLine();

            System.out.print("Enter patient's last name: ");
            String patientLastName = scanner.nextLine();

            System.out.print("Enter patient's Date of Birth (day/month/year): ");
            String patientDOB = scanner.nextLine();

            //Get doctor information
            System.out.print("Enter doctor's first name: ");
            String doctorFirstName = scanner.nextLine();

            System.out.print("Enter doctor's last name: ");
            String doctorLastName = scanner.nextLine();

            System.out.print("Enter doctor's specialty: ");
            String doctorSpecialty = scanner.nextLine();

            // Prompt user for admit and discharge dates
            System.out.print("Enter Admit Date (day/month/year): ");
            String admitDateString = scanner.nextLine();

            System.out.print("Enter Discharged Date (day/month/year): ");
            String dischargeDateString = scanner.nextLine();

            // Prompt user for charges
            System.out.print("Enter pharmacy Charges, room Rent, and doctor Fee: ");
            double pharmacyCharges = scanner.nextDouble();
            double roomCharges = scanner.nextDouble();
            double doctorFee = scanner.nextDouble();

            // Creating doctor
            Doctor doctor = new Doctor(doctorFirstName, doctorLastName, doctorSpecialty);

            // Creating patient
            Date dob = new Date(patientDOB);
            Date admitDate = new Date(admitDateString);
            Date dischargeDate = new Date(dischargeDateString);

            Patient patient = new Patient(patientFirstName,patientLastName,patientID, admitDate, dischargeDate, dob, doctor);

            // Creating bills
            Bill bill = new Bill(patientID, pharmacyCharges, roomCharges, doctorFee);

            // Printing patient information to console using toString
            System.out.println("\nPatient Information:");
            System.out.println(patient);
            System.out.println();
            System.out.println(bill);
            System.out.println();

            // Writing patient information to .txt file
            writeToTxt(patient, bill);

            // Ask user if they want to continue
            System.out.print("Do you want to continue? Enter 'y' for yes, 'n' for no: ");
            proceed = scanner.next().charAt(0);
            scanner.nextLine();
        }

        // Closing scanner
        scanner.close();
    }

    // Method to write patient information to a .txt file
    public static void writeToTxt(Patient patient, Bill bill) {
        String fileName = patient.getName().replace(" ", "") + ".txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println("Patient Information:");
            writer.println(patient);
            writer.println();
            writer.println(bill);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}