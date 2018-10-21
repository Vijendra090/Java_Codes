package wrapperclassdemo;

public class PrimitiveWCDemo {

    public static void modify(Integer i){
        i=i+1;  //1st unboxing, then primitive int i will be incermented by 1 and then autoboxing
        System.out.println(i);  //it prints 13
    }
    public static void main(String args[]){
        Integer i = 12 ;    //autoboxing
        System.out.println(i);
        modify(i);  // Object references are passed by value

        System.out.println(i);  //it prints 12

    }
}
