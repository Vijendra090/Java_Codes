package interfacedemo;

//Interface declaration: by first user
interface Drawable{
    void draw();    //compiler will append public,abstract
    default void fun(){
        System.out.println("Since Java 8, default method is allowed in Interface");
    }
    static void fun1(){
        System.out.println("Since Java 8, static method is allowed in Interface");
    }
}

//Implementation:by second user
class Circle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

//Using interface: by third user
public class InterfaceDemo {
    public static void main(String[] args){
        Drawable drawable = new Circle();// In real scenario, the object is provided by method e.g getDrawable()
        drawable.draw();
        drawable.fun();
        Drawable.fun1();
    }
}
