package Objects.inheritance;

class parent{
    int a = 100;
    void parentMethod(){
        System.out.println("Im Parent:"+" "+a);
    }
}

class Child extends parent{
    void childMethod(){
        System.out.println("Child Method:"+" "+a);
    }
}

public class example {
    public static void main(String[] args) {
        Child c = new Child();
        c.childMethod();
        c.parentMethod();
    }
}
