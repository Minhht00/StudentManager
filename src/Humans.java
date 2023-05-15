import java.util.Date;

public class Humans {
    private int id;
    private String name;
    private Date birthday;
    private String address;
    private double height;
    private double weight;

    public Humans() {
    }

    public Humans(int id, String name, Date birthday, String address, double height, double weight) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Humans{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
