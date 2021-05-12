import java.io.*;

public class Book implements Serializable {
  
  String bookName;
  String bookAuthor;
  String ISBN;

    public Book() {
     this.bookName = "Cows in the meadow";
     this.bookAuthor = "Cyrus the Great";
     this.ISBN = "011831";
    }

    public Book (String bookName, String bookAuthor, String ISBN){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.ISBN = ISBN;
    }

    public String getbookName(){
        return bookName;
    }

    public void setbookName(String bookName){
        this.bookName = bookName;
    }

    public String getbookAuthor(){
        return bookAuthor;
    }

    public void setbookAuthor(String bookAuthor){
        this.bookAuthor = bookAuthor;
    }

    public String getISBN(){
        return ISBN;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
}
