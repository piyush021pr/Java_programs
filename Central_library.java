class library{
    String [] books;
    int no_of_books;
    library(){
        this.books=new String[100];
        this.no_of_books=0;
    }
    void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+" has been added");
    }
}
public class Central_library {
    public static void main(String[] args) {
    library obj=new library();
    obj.addBook("Tom and jerry");
    }
}
