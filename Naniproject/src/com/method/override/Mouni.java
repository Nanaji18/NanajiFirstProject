package com.method.override;

public class Mouni extends Nani {
	
	
	public void add(int x) {
		System.out.println("Mouni");
	}
	
	public static void main(String[] args) {
		Nani obj=new Mouni();
		Nani obj1=new Nani();
		Mouni obj2=new Mouni();
		obj.add(1);
		obj1.add(2);
		obj2.add(3);
	}

}
