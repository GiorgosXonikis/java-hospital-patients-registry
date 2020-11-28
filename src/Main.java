import java.util.Scanner;

public class Main {

    private static PatientsList patientsList = new PatientsList();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice;

        while (!quit) {
            menu();
            System.out.println("Δώσε την επιλογή [1..6]");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    createPatient();
                    break;
               case 2:
                    System.out.println("Δώσε τον AMKA του ασθενή: ");
                    double p = sc.nextDouble();
                    if (patientsList.getPatient(p) != null) {
                        System.out.println("Patient found");
                        System.out.println(patientsList.getPatient(p).toString());
                    } else System.out.println("Patient not found");
                    break;
                case 3:
                    System.out.println("Δώσε το όνομα του ασθενούς: ");
                    String name = sc.nextLine();
                    patientsList.changePatientType(name);
                    break;
                case 4:
                    System.out.println("Δώσε τον AMKA του ασθενή: ");
                    double am = sc.nextDouble();
                    patientsList.updatePatientResults(am);
                    break;
                case 5:
                    patientsList.print();
                    break;
                case 6:
                    quit = true;
                    break;
            }

        }


    }


    private static void menu() {
        System.out.println("*************************************************************");
        System.out.println("1. Καταχώριση νέου ασθενούς");
        System.out.println("2. Εμφάνιση των στοιχείων ενός ασθενούς");
        System.out.println("3. Αλλαγή της κατηγορίας ενός ασθενούς από μετανάστη σε EU");
        System.out.println("4. Καταχώριση των αποτελεσμάτων των εξετάσεων ενός ασθενούς");
        System.out.println("5. Εμφάνιση λίστας ασθενών");
        System.out.println("6. Έξοδος");
    }

    private static Patient createPatient() {
        Patient p;
        System.out.println("ΚΑΤΑΧΩΡΙΣΗ ΝΕΟΥ ΑΣΘΕΝΟΥΣ");
        System.out.println("Δώσε το ονοματεπώνυμο του ασθενή: (String)");
        String name = sc.nextLine();

        System.out.println("Δώσε τη διεύθυνση του ασθενή: (String)");
        String address = sc.nextLine();

        System.out.println("Δώσε το τηλέφωνο του ασθενή: (String)");
        String tel = sc.nextLine();

        System.out.println("Please provide the patient's nationality: (String)");
        String nationality = sc.nextLine();

        System.out.println("Type 1 for native patient and 2 for foreigner: (int)");
        int type = sc.nextInt();
        if (type == 1) {
            System.out.println("Δώσε τον αριθμό μητρώου κοινωνικής ασφάλισης του ασθενή: (double)");
            double insuranceId = sc.nextDouble();
            p = new NativePatient(name, address, tel, insuranceId);
        } else p = new ForeignerPatient(name, address, tel, nationality);
        sc.nextLine();
        patientsList.addPatient(p);
        return p;
    }


}


