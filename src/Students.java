import java.util.Date;

public class Students extends Humans{
    private int studentId;
    private String schoolName;
    private int timeStart;
    private double CGPA;

    public Students() {
    }

    public Students(int studentId, String schoolName, int timeStart, double CGPA) {
        this.studentId = studentId;
        this.schoolName = schoolName;
        this.timeStart = timeStart;
        this.CGPA = CGPA;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentId=" + studentId +
                ", schoolName='" + schoolName + '\'' +
                ", timeStart=" + timeStart +
                ", CGPA=" + CGPA +
                '}';
    }
}
