public class ForeignerPatient extends Patient {

    private MicrobiologicalTest test;
    private String nationality;

    public ForeignerPatient(String name, String address, String telephone, String nationality) {
        super(name, address, telephone);
        this.test = null;
        this.nationality = nationality;
    }

    public void storeResults(double examResult, String examName, String date) {
        this.test = new MicrobiologicalTest(examResult, examName, date);
    }


    public String toString() {
        String output = "***** Ασθενής Μετανάστης*****\n";
        output += super.toString();
        if (test != null) {
            output += test.toString();
        }

        return output;
    }


}
