package packagedemo;

public class A {
    protected int x=10;
    int y=20;
}

class C {
    void funC(A a){
        System.out.println(a.x +" "+ a.y);
    }
}