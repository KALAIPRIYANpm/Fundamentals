class th extends Thread{
    public void run(){
        System.out.println("Hello from here : "+Thread.currentThread().getName());
    }
}

public class exgthread {
    public static void main(String[] args) {
        th t = new th();
        t.start();
        t.run();
    }
}
