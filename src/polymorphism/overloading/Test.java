package polymorphism.overloading;

class Base{
    public static void display(){
        System.out.println("Base class static method");
    }

    public void display1(){
        System.out.println("Base class instance method");
    }
}

class Child extends Base{
    //this method is hidden from Parent class display method
    public static void display() {
        System.out.println("Child static method");
    }

    public void display1(int x){
        System.out.println("Child instance method and X = "+x);
    }
}

public class Test {
    public static void main(String [] args){
        Base base = new Child();
        Child child = new Child();
        base.display();     //base class static method is called
        base.display1();
        child.display();    //child class static method is called
        child.display1(10);
    }
}
