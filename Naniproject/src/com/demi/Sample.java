package com.demi;

public class Sample {

	public static void main(String[] args) {

		String s = "HelloWorld";
		int k = 0;
		for (char c : s.toCharArray()) {
			k++;
		}
		System.out.println(k);

		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		
		String J="Welcome to India";
		System.out.println(J);
		
		String[] arr=J.split(" ");
		
		for(String f:arr) {
			System.out.println(f);
		}

	}

}
