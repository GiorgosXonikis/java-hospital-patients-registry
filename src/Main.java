import java.util.Scanner;

public class Main {

    private static PatientsList patientsList = new PatientsList();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice;

        while (!quit) {
            menu();
            System.out.println("Give a choice [1..5]");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    createPatient();
                    break;
                case 2:
                    printPatient();
                    break;
                case 3:
                    insertPatientResults();
                    break;
                case 4:
                    printAllPatients();
                    break;
                case 5:
                    quit = true;
                    break;
            }
        }
    }

    private static void menu() {
        System.out.println("*************************************************************");
        System.out.println("1. Insert new patient");
        System.out.println("2. Print patient's data");
        System.out.println("3. Insert patient's test");
        System.out.println("4. Print patients list");
        System.out.println("5. Exit");
    }

    private static void createPatient() {
        System.out.println("1. Insert new patient");
        System.out.println("Please type patient's name: (String)");
        String _name = sc.nextLine();

        System.out.println("Please type patient's address: (String)");
        String _address = sc.nextLine();

        System.out.println("Please type patient's telephone: (String)");
        String _tel = sc.nextLine();

        System.out.println("Please type 1 for Native patient and 2 for Foreigner: (int)");
        int type = sc.nextInt();

        if (type == PatientType.NATIVE_PATIENT) {
            System.out.println("Please type the patient's national insurance number: (double)");
            double _insuranceId = sc.nextDouble();
            patientsList.addPatient(new NativePatient(_name, _address, _tel, _insuranceId));
        }

        if (type == PatientType.FOREIGNER_PATIENT) {
            System.out.println("Please type patient's nationality: (String)");
            String _nationality = sc.next();
            patientsList.addPatient(new ForeignPatient(_name, _address, _tel, _nationality));
        }
    }

    private static void printPatient() {
        System.out.println("Please type the patient's insurance id: (double)");
        double _insuranceId = sc.nextDouble();

        if (patientsList.getPatient(_insuranceId) != null) {
            System.out.println(patientsList.getPatient(_insuranceId).toString());
        } else System.out.println("Patient not found");
    }

    private static void insertPatientResults() {
        System.out.println("Please type the patient's insurance id: (double)");
        double insuranceId = sc.nextDouble();

        int _index = patientsList.getPatientIndex(insuranceId);

        if (_index != -1) {
            System.out.println("Give exam's date: (String)");
            String _date = sc.next();

            System.out.println("Give exam's name: (String)");
            String _name = sc.next();

            System.out.println("Give exam's result: (String)");
            String _result = sc.next();

            patientsList.addPatientResults(_index, _date, _name, _result);
        }

    }

    private static void printAllPatients() {
        patientsList.print();
    }


}


