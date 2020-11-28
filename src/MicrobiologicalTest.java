public class MicrobiologicalTest {

    private String date;
    private String name;
    private String result;

    public MicrobiologicalTest(String _date, String _name, String _result) {
        this.result = _result;
        this.name = _name;
        this.date = _date;
    }

    public String toString() {
        return "\n Date:" + this.date + "\n Exam: " + this.name + "\n Result: " + this.result;
    }


}




