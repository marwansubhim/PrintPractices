package day34_Tasks;

public class Two extends One {
    String address;
    public Two(String name, int num, String address) {
        super(name, num);
        this.address = address;
    }

    @Override
    public String toString() {
        return "Two{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", address='" + address + '\'' +
                '}';
    }
}
