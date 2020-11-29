import java.util.ArrayList;


public class PatientsList {
    private ArrayList<Patient> patientsList;

    public PatientsList() {
        this.patientsList = new ArrayList<Patient>();
    }

    public void addPatient(Patient thePatient) {
        this.patientsList.add(thePatient);
    }

    public void print() {
        for (Patient patient : this.patientsList) {
            System.out.println(patient.toString());
        }
    }

    public int getPatientIndex(double insuranceId) {
        for (Patient _patient : this.patientsList) {
            if (_patient.getNationalInsuranceId() == insuranceId) {
                return this.patientsList.indexOf(_patient);
            }
        }
        System.out.println("Patient not found");
        return -1;
    }

    public Patient getPatient(double insuranceId) {
        if (this.getPatientIndex(insuranceId) != -1) {
            return this.patientsList.get(getPatientIndex(insuranceId));
        }
        return null;
    }

    public void addPatientResults(int _index, String _date, String _name, String _result) {
        MicrobiologicalTest _test = new MicrobiologicalTest(_date, _name, _result);
        patientsList.get(_index).storeResults(_test);

    }


}