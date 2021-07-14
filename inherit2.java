class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

class galudiyu extends Dog {
    void feed() {
        System.out.println("feeeding...");
    }
}

class TestInheritance {
    public static void main(String args[]) {
        galudiyu d = new galudiyu();
        d.bark();
        d.eat();
        d.feed();
    }
}