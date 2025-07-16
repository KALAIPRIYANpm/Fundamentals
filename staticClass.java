public class staticClass {
    static int x = 10;
    static void display(){
         System.out.println("HI"+" "+x);
    }  
}
class hello{
    public static void main(String[] args) {
        staticClass.display();
    }
}
