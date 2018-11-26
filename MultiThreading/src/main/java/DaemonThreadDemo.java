/*1:Daemon thread provides services to user threads for background supporting task.
* 2:Its life depends on user thread
* 3:it is low priority thread
*
* Methods for Java Daemon thread by Thread Class
*   1: public void setDaemon(boolean status)
*   2: public boolean isDaemon()
*/

public class DaemonThreadDemo extends Thread{

    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread work");
        }else{
            System.out.println("user thread");
        }
    }

    public static void main(String [] args){
        DaemonThreadDemo th1 = new DaemonThreadDemo();
        DaemonThreadDemo th2 = new DaemonThreadDemo();
        DaemonThreadDemo th3 = new DaemonThreadDemo();

        th1.setDaemon(true);

        th1.start();
        th2.start();

        th2.setDaemon(true);    //will throw exception here : java.lang.IllegalThreadStateException bcoz we changeing after start
        th3.start();
    }
}
