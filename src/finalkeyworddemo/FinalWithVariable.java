package finalkeyworddemo;

class FinalDemo{
    //normal instance variable
    int x=100;

    //final static variable
    final static int STATICVAR1=10; //final static variable declaration and initialization in same line
    final static int STATICVAR2;    //blank final static variable can be initialized inside a static block

    //non static final variable
    final int FINALVAR1=5;  //final variable declaration and initialization in same line
    final int FINALVAR2;    //blank final variable
    final int FINALVAR3;
    FinalDemo(){
        FINALVAR2=10;   // blank final variable either initialized inside constructor or inside init block
    }
    {   //init block is used to assign the value of final variable
        FINALVAR3=15;
    }
    static {    //static block is used to assign the value of static final variable
        STATICVAR2=100;
    }

    FinalDemo(int a){
        FINALVAR2=a;    //if you have more than one constructor in your class, then blank final variable must be initialized
                        // in all ot them else it shows compiler error will be thrown
    }
    void display(){
        System.out.println(FINALVAR1);
        System.out.println(FINALVAR2);
        System.out.println(FINALVAR3);
    }
}

public class FinalWithVariable {
    public static void main(String[] args)  {

        new FinalDemo().display();
        new FinalDemo(19).display();
        //Reference final variable
        final FinalDemo finalDemo= new FinalDemo();
        //changing the variable x inside the object pointed by finalDemo reference variable
        System.out.println(finalDemo.x);
        finalDemo.x=3;
        System.out.println(finalDemo.x);

    }
}
