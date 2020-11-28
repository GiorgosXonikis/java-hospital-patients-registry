public abstract class Patient {
    private String name;
    private String address;
    private String telephone;
    private double nationalInsuranceId;
    private int type;

    public Patient(String name, String address, String telephone, double nationalInsuranceId) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.nationalInsuranceId = nationalInsuranceId;
        this.type = PatientType.NATIVE_PATIENT;
    }

    public Patient(String name, String address, String telephone) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.nationalInsuranceId = 0;
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

    public double getNationalInsuranceId() {
        return this.nationalInsuranceId;
    }

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

    abstract public void storeResults(double examResult, String examName, String date);

}
