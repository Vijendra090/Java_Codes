public class Example2 {

    public void method3() throws Exception{
        throw new Exception();
    }
    public void method2() throws Exception{
        method3();
    }
    public void method1() throws Exception{
        method2();
    }

    public static void main(String [] args) {
        Example2 obj = new Example2();
        try {
            obj.method1();
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Caught in main method");
        }
        System.out.println("rest of the codes...");
    }
}
