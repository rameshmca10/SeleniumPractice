package week3.day2;

public class Automation extends MultipleLanguages implements Language, TestTool {

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("selenium from implementation class");

	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("java from implementation class");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby from implementation class,override");
	}

	public static void main(String[] args) {
		Automation at = new Automation();
		at.selenium();
		at.java();
		at.ruby();
		at.python();

	}

}