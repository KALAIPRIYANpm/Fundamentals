package Objects;

public class staticMethod {
    class InnerClass{
        static void display(){
            System.out.println("Hello all");
        }
    }

    public static void main(String[] args) {
        staticMethod.InnerClass.display();
    }
    
}
