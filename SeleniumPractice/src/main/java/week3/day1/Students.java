package week3.day1;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Student ID is: " + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID is: " + id + " and Name is " + name);
	}

	public void getStudentInfo(String email, int phone) {
		System.out.println("Student email is: " + email + " and phone number is " + phone);
	}

	public static void main(String[] args) {
		Students s = new Students();
		s.getStudentInfo(4785);
		s.getStudentInfo(65879, "Ram");
		s.getStudentInfo("ram@gmail.com", 987546213);
	}

}