package accessmodifierdemo.protecteddemo.pack.mypack;

import accessmodifierdemo.protecteddemo.pack.*;

public class B extends A {//(2).If you want to access protected method of a public class outside the pkg need to extend it
    public static void main(String[] args){
        A a = new A();  //(1).Class A is public so it is allowed to access to outside the package
        //a.msg();     but its method msg() has protected AM so not allowed to access outside the package pack

        //(3).after extending the class A, now we are able to access the protected method msg()
        A a1 = new B();
        // a1.msg(); with parent reference variable not allowed to access protected method msg()

        B b = new B();
        b.msg();
    }
}
