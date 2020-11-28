import java.util.Scanner;
import java.util.ArrayList;


public class PatientsList {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Patient> patientsList;

    public PatientsList() {
        this.patientsList = new ArrayList<Patient>();
    }

    public void addPatient(Patient thePatient) {
        this.patientsList.add(thePatient);
    }

    public void print() {
         for (int i = 0; i < this.patientsList.size(); i++) {
            System.out.println(this.patientsList.get(i).toString());
        }
    }

    public int getPatientIndex(double insuranceId) {
        int p = -1;
        for (int i = 0; i < this.patientsList.size(); i++) {
            if (this.patientsList.get(i).getNationalInsuranceId() == insuranceId)
                p = this.patientsList.indexOf(this.patientsList.get(i));
        }
        return p;
    }

    public Patient getPatient(double insuranceId) {
        Patient p = null;
        int q = this.getPatientIndex(insuranceId);
        if (q != -1) {
            p = this.patientsList.get(getPatientIndex(insuranceId));
        }

        return p;
    }

    public void changePatientType(String theName) {
        for (int i = 0; i < patientsList.size(); i++) {
            if (patientsList.get(i).getName().equals(theName) && patientsList.get(i).getType() == PatientType.NATIVE_PATIENT) {
                String n = patientsList.get(i).getName();
                String a = patientsList.get(i).getAddress();
                String t = patientsList.get(i).getTelephone();
                System.out.println("Give Insurance Id...");
                double am = sc.nextDouble();
                Patient p = new NativePatient(n, a, t, am);
                patientsList.remove(i);
                patientsList.add(p);
                i++;
            } else System.out.println("Patient already EU");
        }
    }


    public void updatePatientResults(double insuranceId) {
        int p = getPatientIndex(insuranceId);
        if (p != -1) {
            System.out.println("Give exam's result: (double)");
            double result = sc.nextDouble();
            sc.nextLine();
            System.out.println("Give exam's name: (String)");
            String name = sc.nextLine();
            System.out.println("Give exam's date: (String)");
            String date = sc.nextLine();
            patientsList.get(p).storeResults(result, name, date);
        }

    }


}