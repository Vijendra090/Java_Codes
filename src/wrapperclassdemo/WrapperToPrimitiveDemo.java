package wrapperclassdemo;

public class WrapperToPrimitiveDemo {
    public static void main(String[] args){
        Integer a = 10;
        int i = a.intValue();   //converting Integer to int
        int j=a;                //unboxing, compiler will place a.intValue() implicitly
        System.out.println(a+" "+i+" "+j);
    }
}
