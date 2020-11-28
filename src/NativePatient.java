import java.util.ArrayList;

public class NativePatient extends Patient {

    private ArrayList<MicrobiologicalTest> testsList;

    public NativePatient(String _name, String _address, String _telephone, double _nationalInsuranceId) {
        super(_name, _address, _telephone, _nationalInsuranceId);
        this.testsList = new ArrayList<MicrobiologicalTest>();
    }

    public void storeResults(MicrobiologicalTest test) {
        this.testsList.add(test);
    }

    public String toString() {
        StringBuilder output = new StringBuilder("***** Native Patient *****\n");

        output.append(super.toString());

        for (MicrobiologicalTest _test : this.testsList) {
            output.append(_test.toString());
        }
        return output.toString();
    }




}
