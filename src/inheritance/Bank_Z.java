package inheritance;

public class Bank_Z extends Bank_Y {
	public void locker() {
		System.out.println("100 carrot diamond");
	}
	public static void main(String[]args) {
		Bank_Z c = new Bank_Z();
		c.locker();
		c.gold();
		c.money();
		c.landDocument();
	}

}
