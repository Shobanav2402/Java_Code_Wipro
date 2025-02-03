class items {
    protected String author;
    protected String title;
    protected int publicationyear;
    public items(String title,String author,int publicationyear){
        this.author = author;
        this.title = title;
        this.publicationyear = publicationyear;
    }
    public void displaydetails(){
        System.out.println("title "+title);
        System.out.println("author "+ author);
        System.out.println("publication year "+publicationyear);
    }

}
class book extends items{
    private String genre;
    public book(String title,String author,int publicationyear,String genre){
        super(title, author, publicationyear);
        this.genre = genre;
    }
    public void displaydetails(){
        super.displaydetails();
        System.out.println("genre "+genre);
        System.out.println();
    }
}
class magazine extends items{
    private String issuenumber;
    public magazine(String title,String author,int publicationyear,String issuenumber){
        super(title, author, publicationyear);
        this.issuenumber = issuenumber;
    }
    public void displaydetails(){
        super.displaydetails();
        System.out.println("issuenumber "+issuenumber);
        System.out.println();
    }
}
public class LibraryManagement{
    public static void main(String[] args) {
        book b = new book("Wings of Fire", "APJ Abdul kalam", 2015, "Biography");
        magazine m = new magazine("National geography", "Various Authors", 2023, "August edition");

        b.displaydetails();
        m.displaydetails();
        
    }

}

