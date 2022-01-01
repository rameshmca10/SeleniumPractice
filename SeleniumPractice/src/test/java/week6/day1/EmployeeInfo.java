package week6.day1;

public class EmployeeInfo {

	int empId;
	String empName;
	static String companyName;

	public void setInfo(int id, String name, String company) {
		empId = id;
		empName = name;
		companyName = company;
	}

	public void printInfo() {
		System.out.println(empId + " " + empName + " " + companyName);
	}

	public static void main(String[] args) {

		EmployeeInfo e1 = new EmployeeInfo();
		e1.printInfo();
		e1.setInfo(457, "ram1", "company1");
		e1.printInfo();

		EmployeeInfo e2 = new EmployeeInfo();
		e2.setInfo(789, "ram2", "company2");
		e1.printInfo();
		e2.printInfo();
	}

}
