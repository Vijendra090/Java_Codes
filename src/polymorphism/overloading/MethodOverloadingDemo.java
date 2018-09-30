package polymorphism.overloading;

public class MethodOverloadingDemo {
    public void sum(int a,int b){
        System.out.println(a+b);
    }

    public void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args){
        MethodOverloadingDemo obj =new MethodOverloadingDemo();

        obj.sum(2,3);
        obj.sum(2,3,4);
    }
}
