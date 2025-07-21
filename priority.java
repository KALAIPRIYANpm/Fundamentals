class priority extends Thread{

    public void run(){
        System.out.println(Thread.currentThread()+" "+Thread.currentThread().getPriority() );
    }
}

class multi{
    public static void main(String[] args) {
        priority p1 = new priority();
        priority p2 = new priority();
        priority p3 = new priority();
        p1.setPriority(Thread.MAX_PRIORITY);
        p2.setPriority(Thread.MIN_PRIORITY);
        p3.setPriority(Thread.NORM_PRIORITY); 
        p1.start();
        p2.start();
        p3.start();
    }
}