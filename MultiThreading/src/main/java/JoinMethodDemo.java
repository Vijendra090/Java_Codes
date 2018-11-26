public class JoinMethodDemo extends Thread{
    @Override
    public void run() {
        super.run();
        for(int i=0;i<5;i++) {
            try{
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(i+": running thread: "+getName());
            if(i==2)
                Thread.currentThread().setName("VIJ");
        }
    }

    public static void main(String[] args){
        JoinMethodDemo thread1 = new JoinMethodDemo();
        JoinMethodDemo thread2 = new JoinMethodDemo();
        JoinMethodDemo thread3 = new JoinMethodDemo();

        thread1.start();

        try{
            thread1.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        thread2.start();
        try {
            thread2.join(1500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        thread3.start();
    }
}
