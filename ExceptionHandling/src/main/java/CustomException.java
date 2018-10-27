class MyException extends Exception{
    public MyException(){
        super();    //placed by compiler
    }

    public MyException(String msg){
        super(msg); //passing the msg to the parent class constructor
    }
}

public class CustomException {
    public static void main(String [] args){
        try{
            //throw new MyException();
            throw new MyException("Custom exception caught");   //throw keyword is used to throw an exception explicitly
        }
        catch(MyException e){
            System.out.println("Caught");
            System.out.println(e.getMessage());
        }
    }
}
