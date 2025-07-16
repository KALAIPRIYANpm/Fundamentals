package Objects;

public class innerClass {
    void outerMethod(){
        class inner{
            void display(){
                System.out.println("Checking the inner class");
            }
        }
        inner obj = new inner();
        obj.display();
    }
}

class classes{
    public static void main(String[] args) {
        innerClass obj1 = new innerClass();
        obj1.outerMethod();
    }
}
