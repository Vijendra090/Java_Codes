package abstractiondemo;
/*Animal is an Abstract class. Abstract class contains both abstract and non-abstract methods.
* We cant create the object of the Abstract class. To use this class, you need another class that
* extend the abstract class and override the abstract methods, then with the help of child class method
* you can call non-abstract methods of parent class as well as implemented methods.
*/
abstract class Animal{
    Animal(){   // Abstract class contain the constructor
        System.out.println("Abstract class Constructor");
    }
    abstract void sound();

    final void walking(){   //Abstract class may have final method,it forces subclass not to change the body of method.
        System.out.println("Animal is walking");
    }

    static void danger(){   //Abstract class may have static methods
        System.out.println("Animals are danger");
    }
}

class Dog extends Animal{   //in real senario, implementation is provided by others i.e unknown by end user
    @Override
    void sound() {
        System.out.println("Dogs is Barking");
    }

    static void danger(){
        System.out.println("Dogs are not danger");
    }
}

public class AbstractionDemo {
    public static void main(String []args){
        Animal animal = new Dog();  //In real scenario, object is provided through method, e.g getAnimal() method.
        animal.sound(); //in real scenario method is called by programmer or user
        animal.walking();
        animal.danger();
        Dog dog = new Dog();
        dog.danger();
    }
}