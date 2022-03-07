package com.abstraction;

public class AbstractClassNon1 extends AbstractClassNon {
	@Override
	public void atmOwner() {
		super.atmOwner();
	}



	@Override
	public void atmPin() {
		System.out.println("atm pin num is 1234");

	}
	@Override
	public void atmCvv() {
		System.out.println("atm cvv num is 000");

	}
	public static void main(String[]args) {
		// class name object name = new class name();
		AbstractClassNon1 f = new AbstractClassNon1();
		f.atmOwner();
		f.atmPin();
		f.atmCvv();
	}


}
