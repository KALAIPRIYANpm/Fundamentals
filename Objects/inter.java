package Objects;

interface personalInfo{
    void display();
    void message();
}



 class inter implements personalInfo {

    String name ;
    int age ;
    public void display(){
        System.out.println("Name:"+name+"Age:"+age);
    }
    public void message(){
        System.out.println("Student Details");
    }
    class Teacher implements personalInfo{
       public void display(){
        System.out.println("Im a teacher");
       }
       public void message(){
        System.out.println("hello im the teacher");
       }
    }

    public static void main(String[] args) {
        inter i = new inter();
        i.name="kalaipriyan";
        i.age = 20;
        i.display();
        i.message();
        inter.Teacher t = i.new Teacher();
        t.display();
        t.message();
    }

    
}
