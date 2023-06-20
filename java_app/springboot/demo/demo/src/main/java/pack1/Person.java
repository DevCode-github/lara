package pack1;

public class Person {
	private String userId;
	private String firstName;
	private String lastName;
	private int age;
	public Person() {}
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String toString() {
		return "{" + "firstName : "+ this.firstName + ", lastName : " + this.lastName + ", age :" + this.age + ", userId : " + this.userId + "}";
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
	@Override
	public int hashCode() {
		return this.userId.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		return this.userId.equals(((Person)obj).userId);
	}
	
}
