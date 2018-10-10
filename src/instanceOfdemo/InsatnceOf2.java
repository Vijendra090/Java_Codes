package instanceOfdemo;
// Possiblity of down-casting with instanceOf operator

class Animal1{

}
class Dog1 extends Animal1{
    static void method(Animal1 animal1){
        if(animal1 instanceof Dog1){
            Dog1 dog1 = (Dog1)animal1;  // actual object referred by animal1, is an object of dog class. So down-casting
                                        // works fine. But if aniaml1 refer the object of Animal1,then we get ClassCastException on runtime
            System.out.println("OK down-casting is performed");
        }
    }
}

public class InsatnceOf2 {
    public static void main(String[] args){
        Animal1 animal1 = new Dog1();
        Dog1.method(animal1);
    }
}
