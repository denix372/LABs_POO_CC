package Lab4.Problema4;

public class Person {
    String name, address;

    public Person(){
        name = "";
        address = "";
    }

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Persoana are numele: " + name ;
    }
}
