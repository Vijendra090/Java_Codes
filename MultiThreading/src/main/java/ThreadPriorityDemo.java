/* Each thread have a priority. Priorities are represented by a number between 1 to 10.
*  Thread schedular schedules the thread based on JVM specification(primitive or time slicing)
*  3 constants defined in Thread Class
*  public static int MIN_PRIORITY   :min 1
*  public static int MAX_PRIORITY   :max 10
*  public static int NORM_PRIORITY  :default 5*/

public class ThreadPriorityDemo extends Thread {
    @Override
    public void run() {
        System.out.println("running thread name:"+Thread.currentThread().getName());
        System.out.println("running thread priority:"+Thread.currentThread().getPriority());
    }

    public static void main(String[] args){
        ThreadPriorityDemo thread1= new ThreadPriorityDemo();
        ThreadPriorityDemo thread2= new ThreadPriorityDemo();

        thread1.setPriority(MAX_PRIORITY);
        thread2.setPriority(MIN_PRIORITY);

        thread1.start();
        thread2.start();
    }
}
