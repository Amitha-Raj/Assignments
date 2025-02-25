package encapsulation;

public class Person {
	private String name;
	private int age;
	private String rollnumberString;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRollnumberString() {
		return rollnumberString;
	}
	public void setRollnumberString(String rollnumberString) {
		this.rollnumberString = rollnumberString;
	}

}
