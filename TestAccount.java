class Account {
    int acno;
    String name;
    float balance;

    void deposit(float i) {
        balance = balance + i;
        System.out.println("Deposited money" + i);
    }

    void withdraw(float j) {
        balance = balance - j;
        System.out.println("Withdrawned money" + j);
    }

    void display() {
        System.out.println(name + " " + balance);
    }

    void insert(int ac, String n, float ba) {
        acno = ac;
        name = n;
        balance = ba;
    }

}

class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account();

        a1.insert(88, "kanu", 0);
        a1.deposit(500);
        a1.display();

        a1.withdraw(500);
        a1.display();
    }
}