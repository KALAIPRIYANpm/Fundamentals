class one{
    void display(String name){
        System.out.println("Hello im overriden"+name);
    }
}

class two{
    void display(String name){
        System.out.println(name);
    }
}



public class Override {
    public static void main(String[] args) {
        one obj1 = new one();
    two obj2 = new two();
    obj1.display("kalai");
    obj2.display("hello");
    }
    
}
