package com.control.statements;

public class DemoLoop {
	public static void main(String[] args) {
		System.out.println("*****for loop");
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
		int sum = 0;  
		for(int j = 1; j<=10; j++) {  
		sum = sum + j;  
		}  
		System.out.println("The sum of first 10 natural numbers is " + sum);  
	    System.out.println("****for each loop");
	    String[] names = {"Java","C","C++","Python","JavaScript"};    
	    System.out.println("Printing the content of the array names:\n");    
	    for(String name:names) {    
	    System.out.println(name);    
	    }    
		System.out.println("******while loop");
		int i = 0;    
		System.out.println("Printing the list of first 10 even numbers \n");    
		while(i<=10) {    
		System.out.println(i);    
		i = i + 2;    
		}    
		int x=5;
		while(x<=10) {
			System.out.println("Hi Mouni");
			x++;
		}
		System.out.println("*****do while loop");
		int p = 0;    
		System.out.println("Printing the list of first 10 even numbers \n");    
		do {    
		System.out.println(p);    
		p = p + 2;    
		}while(p<=10);  
	}

}
