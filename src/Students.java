import java.util.Date;

public class Students extends Humans{
    private int studentId;
    private String schoolName;
    private Date timeStart;
    private double CGPA;

    public Students() {
    }

    public Students(int id, String name, Date birthday, String address, double height, double weight, int studentId, String schoolName, Date timeStart, double CGPA) {
        super(id, name, birthday, address, height, weight);
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
