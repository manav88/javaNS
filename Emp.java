
public class Address {
    String city, state, country;

    Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

}

public class Emp {
    int id;
    String name;
    Address addres;

    Emp(int id, String name, Address addres) {
        this.id = id;
        this.name = name;
        this.addres = addres;
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(addres.city + " " + addres.state + " " + addres.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("gzb", "UP", "india");
        Address address2 = new Address("gno", "UP", "india");

        Emp e = new Emp(111, "varun", address1);
        Emp e2 = new Emp(112, "arun", address2);

        e.display();
        e2.display();

    }
}
