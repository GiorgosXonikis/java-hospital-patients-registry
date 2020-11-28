public class ForeignPatient extends Patient {

    private MicrobiologicalTest test;
    private String nationality;

    public ForeignPatient(String name, String address, String telephone, String nationality) {
        super(name, address, telephone);
        this.nationality = nationality;
    }

    public void storeResults(MicrobiologicalTest test) {
        this.test = test;
    }

    public String toString() {
        StringBuilder output = new StringBuilder("***** Foreign Patient *****\n");

        output.append(super.toString());

        if (this.test != null) {
            output.append(test.toString());
        }

        if (this.nationality != null) {
            output.append(this.nationality);
        }

        return output.toString();
    }


}
