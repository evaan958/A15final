import java.util.ArrayList;

public class Student extends Person {

	String studentNumber;
	ArrayList<LibraryBook> booksOut;

	public Student() {
		super();
		this.studentNumber = "012345";
		this.booksOut = new ArrayList<LibraryBook>();
	}

	public Student(String studentNumber, ArrayList<LibraryBook> booksOut, String firstName, String lastName, int age, String gender) {
//	public Student (String firstName, String lastName, int age, String Gender, String studentNumber){
                super(firstName, lastName, age, gender);
		this.studentNumber = studentNumber;
		this.booksOut = new ArrayList<LibraryBook>();
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public ArrayList<LibraryBook> getBooksOut() {
		return booksOut;
	}

	public void setBooksOut(ArrayList<LibraryBook> booksOut) {
		this.booksOut = booksOut;
	}

	public void addBook(LibraryBook book) {
		this.booksOut.add(book);
	}

	public void removeBook(LibraryBook book) {
		this.booksOut.remove(book);
	}

}
