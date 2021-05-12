public class Person {

	String firstName, lastName, gender;
	int age;

	public Person() {
		this.firstName = "John";
		this.lastName = "Doe";
		this.age = 16;
		this.gender = "male";
		
	}

	public Person(String firstName, String lastName, int age, String gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		// gender is lower case so "maLe" and "MALe" and and other possible combination doesn't break the program
		this.gender = gender.toLowerCase();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
