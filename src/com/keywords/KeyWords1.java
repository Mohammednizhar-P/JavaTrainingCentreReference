package com.keywords;

public class KeyWords1 extends KeyWords {
	int j = 60;
	public void test() {
		int j = 70;
		System.out.println("cclv"+j);
		System.out.println("cccv"+ this.j);
		System.out.println("pcv"+super.j);


	}

	public static void main(String[] args) {
		KeyWords1 d = new KeyWords1();
		d.test();

	}


}
