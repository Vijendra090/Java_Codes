public class MemberInnerClass {

    private int data=10;

    public int outerDisplay(){
        System.out.println("default Outer class method");
        return 0;
    }

    class Inner{    //Member inner class
        void display(){
            System.out.println("Data : "+data);
            System.out.println(MemberInnerClass.this.outerDisplay());
        }

    }

    public static void main(String[] args){
        MemberInnerClass.Inner obj = new MemberInnerClass().new Inner();
        obj.display();
    }
}
