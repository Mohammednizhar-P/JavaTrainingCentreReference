package inheritance;

public class Bank_X {
	public void money() {
		System.out.println("10000000");
	}
	public void gold() {
		System.out.println("5 kilograms");

	}
	public static void main(String[]args) {
		//class name object name = new class name();

		Bank_X i = new Bank_X();
		i.money();
		i.gold();
	}
}
