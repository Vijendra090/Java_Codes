package superkeyworddemo;

class Person{
    void display(){
        System.out.println("Person class display method");
    }
}

class Student extends Person{
    void display(){
        System.out.println("Child class display method");
    }

    void message(){
        super.display();    //super used to invoke immediate parent class method
        display();
    }
}
public class SuperWithMethod {
    public static void main(String [] args){
        Student student = new Student();    //default constructor of Student class is invoked
        student.message();
    }
}
