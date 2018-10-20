package wrapperclassdemo;

public class PrimitiveToObjectDemo {
    public static void main(String [] args){
        int a = 10;
        Integer i = Integer.valueOf(a); //converting int into Integer
        Integer j= a;                   //autoboxing,done by implicitly by the compiler i.e Integer.valueOf(a)
        System.out.println(a+" "+i+" "+j);
    }
}
