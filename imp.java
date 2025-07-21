class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Runnable Threads");
    }
}


public class imp {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t1 = new Thread(r);
        t1.start();

        }
}
