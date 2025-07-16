class doubleClass{
    class second{
        void display(){
            System.out.println("hello world ");
        }
    }

    public static void main(String[] args) {
        doubleClass obj = new doubleClass();
        doubleClass.second obj1 = obj.new second(); // two calsses can be get accessed here 
        obj1.display();
    }
}

