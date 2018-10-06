package initblock;

class A{
    A(){
        super();
        System.out.println("In class A");
    }
    {   //Java compiler copies the code of init block in every constructor below the super().
        System.out.println("Inside init block");
    }
    A(int temp){
        super();
        System.out.println("In class A");
    }

}

public class InitBlockDemo {
    public static void main(String args[]){
        new A();
        new A(3);
    }
}
