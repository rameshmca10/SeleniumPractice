package week3.day1;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("Desktop Size 19");
	}

	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.computerModel();
		d.desktopSize();
	}

}