package Lab4.Problema4;

public class Person {
    private String name;
    private String address;

    public Person(String name, String addres) {
        this.name = name;
        this.address = addres;
    }

    public String getName() {
        return name;
    }

    public String getAddres() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Nume: " + name + "\nAddress: " + address;
    }
}
