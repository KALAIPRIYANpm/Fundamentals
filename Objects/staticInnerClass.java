package Objects;

public class staticInnerClass {
    static void outerMethod(){
        class inner{
            void display(){
                System.out.println("Hello Static method");
            }
        }
        inner obj = new inner();
        obj.display();
    }
}


 class newClass {

    public static void main(String[] args) {
        staticInnerClass.outerMethod();;
    }
    
}