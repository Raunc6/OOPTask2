public class Student extends Person {

    private String studyType;
    private int year;
    private float studyPrice;


    @Override
    public String toString() {
        return "Student{" +
                "studyType='" + studyType + '\'' +
                ", year=" + year +
                ", studyPrice=" + studyPrice +
                '}';
    }

    public Student(String studyType, int year, float studyPrice) {
        this.studyType = studyType;
        this.year = year;
        this.studyPrice = studyPrice;
    }

    public String getStudyType() {
        return studyType;
    }

    public void setStudyType(String studyType) {
        this.studyType = studyType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getStudyPrice() {
        return studyPrice;
    }

    public void setStudyPrice(float studyPrice) {
        this.studyPrice = studyPrice;
    }

}
