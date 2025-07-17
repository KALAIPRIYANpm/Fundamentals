// package Objects.inheritance;

class grandParent{
    int x = 20;
}

class parent extends grandParent{
    void parentMethod(){
        int x = 15;
        System.out.println("parent"+x);
    }
}

class child extends parent{
    void ChildMethod(){
        System.out.println("Child"+x);
    }
}

public class multiLevel {
    public static void main(String[] args) {
        child c = new child();
        c.parentMethod();
        c.ChildMethod();
    }
    
}
