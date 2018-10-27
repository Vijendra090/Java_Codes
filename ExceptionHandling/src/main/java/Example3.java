/*Note.1: Checked exceptions need to be declared in a method or constructor's throws clause if they can be thrown by the execution
* of the method or constructor and propagate outside the method or constructor boundary.
*
* Note.2: RuntimeException and its subclasses are unchecked Exceptions, and no need to declare unchecked exceptions in the method or
* constructor throws clause if unchecked exception can be thrown by the execution of method or constructor's and propagate outside the
* method or constructor boundary.
* */

import java.io.IOException;

class A{

    public A() {
        try {
            throw new IOException();
        }
        catch (IOException e){
            System.out.println(e.getMessage()); //print null
        }
    }

    public void methodA() throws IOException {
        throw new IOException();    //throwing checked exception outside the boundary of method, must be declare in method throws clause
    }

    public void methodB(String msg){      //throwing unchecked exception outside the method boundary, no need to declare in method throws clause
        throw new ArithmeticException(msg);
    }
}
public class Example3 {
    public static void main(String [] args){
        try {
            //new A().methodA();
            new A().methodB("dividebyzero");
        }
        catch (Exception e){
            System.out.println("Hi : "+e.getMessage()); // print Hi: dividebyzero
        }
        System.out.print("rest of the codes");
    }
}
