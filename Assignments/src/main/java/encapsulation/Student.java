package encapsulation;

public class Student {
	private String addressString;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Person person=new Person();
      person.setName("Amitha");
      person.setAge(33);
      person.setRollnumberString("ABC001");
      Student student=new Student();
      student.setAddressString("Anthikad");
      
      System.out.println(person.getName());
      System.out.println(person.getAge());
      System.out.println(person.getRollnumberString());
      System.out.println(student.getAddressString());
      
	}

	public String getAddressString() {
		return addressString;
	}

	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}

}
