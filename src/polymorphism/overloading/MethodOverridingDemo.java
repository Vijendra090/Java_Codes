package polymorphism.overloading;

class Veichle {
    public void run() {
        System.out.println("Veichle is running");
    }
}

class Bike extends Veichle{

    public void run() {
        System.out.println("Bike is running");
    }
}
public class MethodOverridingDemo {
    public static void main(String[] args){
        Veichle obj = new Bike();   //runtime polymorphism
        obj.run();
    }

}
