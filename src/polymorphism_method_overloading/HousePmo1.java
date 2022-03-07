package polymorphism_method_overloading;

public class HousePmo1 {
	public void room() {
		 System.out.println("room name is bedroom");
		}

		public void room(String cot) {
			System.out.println("cot name is "+ cot);
		}
		public void room(int light) {
			System.out.println("bulp count is"+" "+light);
		}
		public void room(String fan,int price) {
			System.out.println("fan name is" +" "+fan+","+" price is "+price);

		}
		public static void main(String[] args) {
			//class name object name = new class name();
			HousePmo1 h = new HousePmo1();
			h.room();
			h.room("sleep");
			h.room(5);
			h.room("crompton",  10000);
		}

}
