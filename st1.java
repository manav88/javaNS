class car {
    String name;
    int nplate;
    float price;
    int speed;

    void insert(String cname, int no, float pr, int sp) {
        name = cname;
        nplate = no;
        price = pr;
        speed = sp;
    }

    void display() {
        System.out.println(name + " " + nplate + " " + price + " " + speed);
    }
}

class add {
    int a;
    int b;

    void insert(int c, int d) {
        a = c;
        b = d;
    }

    void addi() {
        System.out.println(a + b);

    }
}

public class st1 {

    public static void main(String... arg) {
        car c1 = new car();
        car dhruv = new car();
        car aryan = new car();
        car mihir = new car();

        add a1 = new add();
        a1.insert(88, 880);
        a1.addi();
        // c1.insert("aston", 88, 40000000, 250);
        // dhruv.insert("buggati", 22, 320000000, 330);
        // aryan.insert("volvo", 88, 10000000, 200);
        // mihir.insert("tesla", 11, 6000000, 150);

        // c1.display();
        // dhruv.display();
        // aryan.display();
        // mihir.display();
    }
}