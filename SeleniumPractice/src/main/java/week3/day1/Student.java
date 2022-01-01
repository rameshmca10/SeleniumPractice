package week3.day1;

public class Student extends Department {

	public void studentName() {
		System.out.println("Student Name is Ram");
	}

	public void studentDept() {
		System.out.println("Department Name is Science");
	}

	public void studentID() {
		System.out.println("Student ID is 78954");

	}

	public static void main(String[] args) {
		Student st = new Student();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.deptName();
		st.studentName();
		st.studentDept();
		st.studentID();
	}

}