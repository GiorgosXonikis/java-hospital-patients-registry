public class MicrobiologicalTest {

    private double examResult;
    private String examName;
    private String date;

    public MicrobiologicalTest(double examResult, String examName, String date) {
        this.examResult = examResult;
        this.examName = examName;
        this.date = date;
    }

    public String toString() {
        return "\n Date:" + date + "\n Exam: " + examName + "\n Result: " + examResult;
    }


}




