interface tech {
    void display();
}

class one implements tech {
    public void display() {
        System.out.println("Hello Everyone");
    }
}

class two implements tech {
    public void display() {
        System.out.println("Hii");
    }

    public void display1() {
        System.out.println("Hello");
    }
}

public class in {
    public static void main(String[] args) {
        tech obj1 = new one();
        obj1.display();  

        tech obj2 = new two();
        obj2.display(); 

        ((two) obj2).display1();  
    }
}
