
import java.util.*;


// class Animal{
// void display(){
//     System.out.println("Im an animal");
//     }
// }

// class Bird{
//     void display(){
//         System.out.println("Im a Bird");
//     }
// }

// class Parrot extends Animal, Bird {
//     public void eat() {
//         System.out.println("eat");
//     }
//     public void fly() {
//         System.out.println("Fly");
//     }
// }

// public class MultipleInheritanceExample {
//     public static void main(String[] args) {
//         Parrot p = new Parrot();
//         p.eat();
//         p.fly();
//     }
// }




interface Animal{
    void eat();
    default void kalai(){
        System.out.println("hello");
    }
}

interface Bird{
    void fly();
}

class Parrot implements Animal, Bird {
    public void eat() {
        System.out.println("eat");
    }
    public void fly() {
        System.out.println("Fly");
    }
}

public class multi {
    public static void main(String[] args) {
        Parrot p = new Parrot();
        p.eat();
        p.fly();
        p.kalai();
    }
}

