package finalkeyworddemo;
class A{
    final void fun(){
        System.out.println("Overridden Method");
    }
}

class B extends A{
    //overriding is not allowed if overridden method is final
    /*void fun(){
        System.out.println("Overriding Method");
    }*/
}
public class FinalWithMethod {
    public static void main(String[] args){
        A a= new B();
        a.fun();
    }
}
