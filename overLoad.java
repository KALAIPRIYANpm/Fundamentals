
class example{
    void method1(String name){
        System.out.println(name);
    }

    void method1(int a){
        System.out.println(a);
    }
}


public class overLoad {
    public static void main(String[] args) {
        example obj = new example();
        obj.method1(5);
        obj.method1("Hello Everyone");
    }
    
}
