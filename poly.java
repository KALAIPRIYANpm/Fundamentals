class class1{
    public void display(){
        System.out.println("hi");
    }
}

class class2{
    public void display(int a , int b){
        System.out.println(a+b);
    }
}

class class3{
    public void display(int a, int b){
        System.out.println(a-b);
    }
}



public class poly {
    public static void main(String[] args) 
     {
        class1 obj = new class1();
        obj.display();
        class2 obj2 = new class2();
        obj2.display(10,4);
        class3 obj3 = new class3();
        obj3.display(5, 3);
    }
    
}