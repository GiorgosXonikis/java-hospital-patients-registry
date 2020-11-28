import java.util.ArrayList;


public class NativePatient extends Patient {

    private ArrayList<MicrobiologicalTest> tests;

    public NativePatient(String name, String address, String telephone, double insuranceId) {
        super(name, address, telephone, insuranceId);
        tests = new ArrayList<MicrobiologicalTest>();
    }

    public void storeResults(double examResult, String examName, String date) {
        MicrobiologicalTest theTest = new MicrobiologicalTest(examResult, examName, date);
        tests.add(theTest);
    }

    public String toString() {
        String output = "***** Aσθενής EU*****\n";

        output += super.toString();

        for (int i = 0; i < tests.size(); i++) {
            output += tests.get(i).toString();
        }
        return output;
    }




}
