package week3.day1;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("Axis deposit account");
	}

	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.saving();
		ab.fixed();
		ab.deposit();

		BankInfo bi = new AxisBank();
		bi.deposit();

		BankInfo ba = new BankInfo();
		ba.deposit();
	}
}