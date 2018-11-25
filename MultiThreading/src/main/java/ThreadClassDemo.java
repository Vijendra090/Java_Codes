public class ThreadClassDemo extends Thread {

    @Override
    public void run() {
        super.run();
//        System.out.println("Inside the thread");
        for(int i=0;i<5;i++){
          System.out.println("i= "+i +" running thread :"+getName());
        }
    }

    public static void main(String [] args){
        new ThreadClassDemo().start();
        new ThreadClassDemo().start();
    }
}
