class Student{
    String gname;
    int gage;
    Student(String name, int age){
        gname = name;
        gage = age;
    }
    Student(Student s){
        this.gname = s.gname;
        this.gage = s.gage;
    }
    void display(){
        System.out.println("NAME:"+gname+" "+"AGE:"+gage);
    }
}

public class cons {
    public static void main(String[] args) {
        Student s1 = new Student("KALAIPRIYAN",20);
        Student s2 = new Student(s1);
        s1.display();
        s2.display();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
    }
}
