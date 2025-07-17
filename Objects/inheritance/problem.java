package Objects.inheritance;

class Library{

    String Books = "Automic Thoughts";
    String Newspaper = "Hindu";
    String Article = "Article 1";

    void LibraryMethod(){
        System.out.println("Welcome to my Library");
    }
}

class Books extends Library{
    void BookMethods(){
       System.out.println(Books);
    }
}

class Article extends Library{
    void ArticleMethod(){
        System.out.println(Article);
    }
}

class NewsPaper extends Library{
    void New(){
System.out.println(Newspaper); 
}
}


public class problem {
    public static void main(String[] args) {
        Books b = new Books();
        b.BookMethods();
        Article a = new Article();
        a.ArticleMethod();
        NewsPaper n = new NewsPaper();
        n.New();
        n.LibraryMethod();
    }
    
}
