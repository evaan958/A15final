public class LibraryBook extends Book{

    libraryDate dueDate;

    public LibraryBook(libraryDate dueDate, String bookName, String bookAuthor, String ISBN) {
        super(bookName, bookAuthor, ISBN);
        this.dueDate = dueDate;
    }

    public libraryDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(libraryDate dueDate) {
        this.dueDate = dueDate;
    }
}