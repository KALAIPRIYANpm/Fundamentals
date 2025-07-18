package interface;


interface secured{
    void abs();
}
class one implements secured{
    public void abs(){
        System.out.println("Hello from method");
    }
}
public class internal {

    public static void main(String[] args) {
        one i = new one();
        i.abs();
    }
    
}
