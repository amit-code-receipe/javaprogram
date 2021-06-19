package src.com.techlearning.practice.concurrency;

public class ThreadHandling {
    public static void main(String args[]) throws InterruptedException {
        Thread t1=null;
        t1=new Thread(new Runnable() {
            @Override
            public void run() {
                int i=3;
                while(i>0){
                    System.out.println("hello"+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    i--;
                }
            }
        });

        Thread t2=null;
        t2=new Thread(new Runnable() {
            @Override
            public void run() {
                int i=3;
                while(i>0){

                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("welcome"+i);
                    i--;
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();

        t2.join();
        System.out.println("done");
    }
}
