package accessmodifierdemo.defaultdemo.pack;

//public AM have the scope inside as well as outside the package, they are accessible everywhere
public class A {
    public void msg(){
        System.out.println("Method A");

        C c = new C();
        c.msg();
    }
}

// default AM have the scope inside the package, they are not allowed to access outside the package
class C{    //default class
    void msg(){     //default method
        System.out.println("Method C");
    }
}