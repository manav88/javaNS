interface A1 {
    void a();

    void b();

    void c();

    void d();
}

abstract class B1 implements A1 {
    public void c() {
        System.out.println("I am c");
    }
}

class M extends B1 {
    public void a() {
        System.out.println("I am a");
    }

    public void b() {
        System.out.println("I am b");
    }

    public void d() {
        System.out.println("I am d");
    }
}

class Test5 {
    public static void main(String args[]) {
        A1 a = new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}