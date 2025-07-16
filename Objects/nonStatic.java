package Objects;

import Objects.nonStatic.secondClass;

public class nonStatic {
    class secondClass{
        void display(){
            System.out.println("Hello Everyone");
        }
    }
}

class classes{
    public static void main(String[] args) {
        nonStatic obj = new nonStatic();
        nonStatic.secondClass obj2 = obj.new secondClass();
        obj2.display();
    }
}