package Objects.inheritance;

class library{
    String book = "Harry Potter";
    void libraryMethod(){
        System.out.println("It is a Library");
    }
}

class Book extends library{
    String paper = "magicStick";
    void displayStick(){
        System.out.println(book);
    }
}

class paper extends Book{
    void paperMethod(){
        System.out.println(paper);
    }
}

public class Harry {
    public static void main(String[] args) {
        paper p = new paper();
        p.displayStick();
        p.paperMethod();
        p.libraryMethod();
    }
    
}
