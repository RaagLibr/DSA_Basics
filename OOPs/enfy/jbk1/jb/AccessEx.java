package com.enfy.jbk1.jb;

public class AccessEx {
	public static void main(String[] args) {
		AccessDemo ad =  new AccessDemo();
		ad.testDemo();   //private method cannot be used
		ad.setX(5);
		ad.showDemo();
		
		
	}
}
