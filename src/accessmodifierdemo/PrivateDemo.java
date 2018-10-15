package accessmodifierdemo;

class A{
    A(){
    }
    private int x=100;
    private void msg(){
        System.out.print("class A private method");
    }

    public int get(){
        return x;
    }
    public void print(){
        msg();
    }
}
public class PrivateDemo {
    public static void main(String[] args){
        A a = new A();
        // System.out.print(a.x);   C.T.E
        // a.msg()  C.T.E
        System.out.println(a.get());
        a.print();
    }
}
