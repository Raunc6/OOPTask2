public class Lecturer extends Person {

    private int salary;
    private String specialization;

    @Override
    public String toString() {
        return "Lecturer{" +
                "salary=" + salary +
                ", specialization='" + specialization + '\'' +
                '}';
    }

    public Lecturer(int salary, String specialization) {
        this.salary = salary;
        this.specialization = specialization;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
