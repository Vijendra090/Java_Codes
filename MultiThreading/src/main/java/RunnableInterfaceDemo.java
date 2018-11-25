public class RunnableInterfaceDemo implements Runnable {

    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("i= "+i+" thread name: "+ Thread.currentThread().getName());
        }
    }

    public static void main(String [] args){
        new Thread(new RunnableInterfaceDemo()).start();    //thread 1
        new Thread(new RunnableInterfaceDemo()).start();    //thread 2
    }
}
