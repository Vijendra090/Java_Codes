package superkeyworddemo;

class Person1{
    Person1(){
        System.out.println("Person class constructor");
    }
}

class Student1 extends Person1{
    Student1(){
        super();    //this line placed by compiler implicitly if we don't defined explicitly
        System.out.println("Child class constructor");
    }
}
public class SuperWithConstructor {
    public static void main(String [] args){
        new Student1();
    }
}
