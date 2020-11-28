public abstract class Patient {
    private String name;
    private String address;
    private String telephone;
    private double nationalInsuranceId;
    private int type;

    public Patient(String _name, String _address, String _telephone, double _nationalInsuranceId) {
        this.name = _name;
        this.address = _address;
        this.telephone = _telephone;
        this.nationalInsuranceId = _nationalInsuranceId;
        this.type = PatientType.NATIVE_PATIENT;
    }

    public Patient(String _name, String _address, String _telephone) {
        this.name = _name;
        this.address = _address;
        this.telephone = _telephone;
        this.type = PatientType.FOREIGNER_PATIENT;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public double getNationalInsuranceId() { return this.nationalInsuranceId; }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return  "Name: " + this.getName() +
                "\n Address: " + this.getAddress() +
                "\n Telephone: " + this.getTelephone() +
                "\n Insurance id:  " + this.getNationalInsuranceId() +
                "\n Type: " + this.getType();
    }

    abstract public void storeResults(MicrobiologicalTest test);

}
