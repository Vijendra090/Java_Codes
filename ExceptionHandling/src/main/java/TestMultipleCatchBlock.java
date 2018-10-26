public class TestMultipleCatchBlock {

    public static void main(String [] args){
        try {
            int [] a = new int[5];
            a[5] = 30/0;
        }
        catch (ArithmeticException e){
            System.out.print("task 1 is completed");
            System.exit(1);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Task 2 is completed");
        }
        catch (Exception e){
            System.out.println("common task is completed");
        }
        finally {
            System.out.println("finally block will execute always");
        }

    }
}
