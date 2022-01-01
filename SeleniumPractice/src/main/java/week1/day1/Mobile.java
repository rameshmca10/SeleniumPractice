package week1.day1;

public class Mobile {

	byte b = 127;
	char c = 'a';
	String mobileModel = "Samsung A50";
	int mobileWeight = 200;
	boolean isFullCharge = true;
	double mobileCost = 5000;
	float f = 42.587F;
	long l = 9876542;

	public void makeCall() {
		System.out.println("Call Made");

	}

	public void sendMessage() {
		System.out.println("Sent Message");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile mob = new Mobile();
		mob.makeCall();
		mob.sendMessage();
		System.out.println("mobileModel: " + mob.mobileModel);
		System.out.println("mobileWeight: " + mob.mobileWeight);
		System.out.println("isFullCharge : " + mob.isFullCharge);
		System.out.println("mobileCost : " + mob.mobileCost);

		System.out.println("char: " + mob.c);
		System.out.println("byte: " + mob.b);
		System.out.println("long : " + mob.l);
		System.out.println("float : " + mob.f);

	}

}