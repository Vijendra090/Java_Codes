public class Example1 {
    public static void badMethod(){
        throw new RuntimeException();   //unchecked exceptions propagate through caller method
    }
    public static void main(String [] args){
        try{
            badMethod();
            System.out.println("A");    //line 8 is never executed becoz
        }
        catch (RuntimeException ex){
            System.out.println("B");
        }
        catch (Exception ex1){
            System.out.println("C");
        }
        finally {
            System.out.println("D");
        }
        System.out.println("E");
    }
}
