package inheritance;

public class Bank_Y extends Bank_X {
	public void landDocument() {
		System.out.println("100 acres");

	}
	public static void main(String[]args) {
		//class name object name = new class name();
		Bank_Y n = new Bank_Y();
		n.landDocument();
		n.money();
		n.gold();
	}
}
