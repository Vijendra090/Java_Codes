package accessmodifierdemo.defaultdemo.pack.mypack;
import accessmodifierdemo.defaultdemo.pack.*;

public class B {
    public static void main(String [] args){
        //C c = new C();   C.T.E because C is not public in package pack, so not allowed to access outside the package
        //c.msg();
        A a = new A();
        a.msg();
    }
}
