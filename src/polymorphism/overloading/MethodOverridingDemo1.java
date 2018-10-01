package polymorphism.overloading;

class Bank {
    int getRateOfInterest(){
        return 0;   //default
    }
}
class SBI extends Bank{
    int getRateOfInterest(){    //specific implementation of method of parent class
        return 8;
    }
}

class ICICI extends Bank{
    int getRateOfInterest(){    //specific implementation of method of parent class
        return 9;
    }
}
public class MethodOverridingDemo1 {
    public static void main(String[] args){
        SBI sbi = new SBI();
        ICICI icici= new ICICI();
        System.out.println("SBI rate of interest : "+sbi.getRateOfInterest());
        System.out.println("ICICI rate of interest : "+icici.getRateOfInterest());
    }
}
