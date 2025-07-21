class runImplement implements Runnable{
    public void run(){
        System.out.println("Hello from Here");
    }
}


public class threading {
    public static void main(String[] args) {
        runImplement r = new runImplement();
        r.run();
    }
    
}
