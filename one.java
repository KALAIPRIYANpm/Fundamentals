public class one {

    String name;
    public one(String Name) {
        name = Name;
    }
    public void display() {
        System.out.println(name);
    }
    public static void main(String[] args) {
        one s1 = new one("kalai");
        one s2 = new one("priyan");

        s1.display(); 
        s2.display(); 
    }
}
