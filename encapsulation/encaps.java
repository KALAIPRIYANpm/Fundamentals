package encapsulation;

class enca{
    private String name;
    public void setName(String setname){
        name = setname;   
    }
    public String  getName(){
        return name;
    }
}
public class encaps {
    public static void main(String[] args) {
        enca object = new enca();
        object.setName("Kalaipriyan");
        System.out.println(object.getName());
    }
}
 