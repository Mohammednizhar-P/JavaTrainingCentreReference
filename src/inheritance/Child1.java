package inheritance;

public class Child1 extends Appa {
	public void car() {
		System.out.println("land rover");
	}
	public static void main(String[] args) {
		//class name object name = new class name();
		Child1 a = new Child1();
		a.car();
		a.gold();
	}
}
