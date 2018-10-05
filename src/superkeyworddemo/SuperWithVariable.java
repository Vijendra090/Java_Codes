package superkeyworddemo;

class Vechile{
    int maxSpeed=100;   //instance variable
}

class Bike extends Vechile{
    int maxSpeed=40;
    void display(){
        System.out.println("Maxspeed: "+super.maxSpeed);    //super is used to refer immediate class instance variable
        System.out.println("Maxspeed: "+maxSpeed);  //refer child class instance variable
    }
}
public class SuperWithVariable {    //Use of super with variable
    public static void main(String[] args){
        Bike bike = new Bike();
        bike.display();
    }
}
