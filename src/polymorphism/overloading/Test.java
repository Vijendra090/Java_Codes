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

    public void display1(){
        System.out.println("Child instance method");
    }
}

public class Test {
    public static void main(String [] args){
        Base base = new Child();
        Child child = new Child();
        base.display();
        base.display1();
        child.display();
    }
}
