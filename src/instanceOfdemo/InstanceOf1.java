package instanceOfdemo;

class Animal{
}

class Dog extends Animal{
}
public class InstanceOf1 {
    public static void main(String [] args){
        Dog dog=new Dog();  //this is allowed
        //Dog dog1= new Animal(); //this is not allowed, example of down-casting
        //Dog dog2= (Dog)new Animal(); //with type-casting down-casting is allowed, but throw an ClassCastException on runtime
        Animal animal = new Animal();
        if( animal instanceof Dog)  // Parent object is never an instance of child class
            System.out.println("Yes instance of Dog");
        else
            System.out.println("Animal is not instance of Dog");
        Animal animal1 = new Dog();
        if( animal1 instanceof Dog) // Child class object is always an instance of parent class
            System.out.println("Yes instance of Dog");
        else
            System.out.println("Animal is not instance of Dog");

        Dog dog3 = null;
        if(dog3 instanceof Dog) //instanceof will return false if ref variable have null value
            System.out.println("Yes instance of Dog");
        else
            System.out.println("No, not instance of Dog");
    }
}
