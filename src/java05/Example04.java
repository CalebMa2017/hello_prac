package java05;

public class Example04 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
// this.method(O o)  -->  super.method(O o) --> this.method(FO o) --> super.method(FO o)
        a1.show(b); // A and B
        a1.show(d); // A and B
        a2.show(b); // B and B
        a2.show(c); // B and C
        a2.show(d); // B and B
        b.show(c); // B and C
        b.show(d); // B and B
    }

}

class A {
    public void show(A a) {
        System.out.println("A AND A");
    }
    public void show(B b) {
        System.out.println("A AND B");
    }
    public void show(C b) {
        System.out.println("A AND C");
    }
}

class B extends A {
    public void show(B b) {
        System.out.println("B AND B");
    }
    public void show(D c) {
        System.out.println("B AND C");
    }
}

class C extends B {

}
class D extends B {

}