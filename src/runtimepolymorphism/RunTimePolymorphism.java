package runtimepolymorphism;

/*
* RTP is process in which a call to overridden method is resolved at runtime rather than compile time
* RTP cant be achieved by data members
* */

class Bike{
    int speedLimit=100; //data member
    void run(){         // overridden method
        System.out.println("running");
    }
}

class Honda extends Bike{
    int speedLimit=200;
    @Override
    void run() {    //overriding method
        System.out.println("Honda is running");
    }
}
public class RunTimePolymorphism {
    public static void main(String [] args){
        Bike bike= new Honda(); //Upcasting: storing object of child class to Parent reference variable
        bike.run(); //run method is invoked based on the object referenced by the reference variable(bike) on runtime
        System.out.println("speedLimit : "+((Honda) bike).speedLimit);
        System.out.println(bike instanceof Honda);
    }
}
