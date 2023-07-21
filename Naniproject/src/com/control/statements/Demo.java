package com.control.statements;

public class Demo {
	
	public static void main(String[] args) {
		System.out.println("*********if loop");
		int x=5;
		int y=7;
		if(x+y>10) {
			System.out.println(y);
		}
		System.out.println("**********if else loop");
		int x1=5;
		int y1=7;
		if(x1+y1>10) {
			System.out.println(y+" :greater than 10");
		}
		else {
			System.out.println("less than 10");
		}
		
		System.out.println("*********if-else-if");
		String city = "Delhi";  
		if(city == "Meerut") {  
		System.out.println("city is meerut");  
		}else if (city == "Noida") {  
		System.out.println("city is noida");  
		}else if(city == "Agra") {  
		System.out.println("city is agra");  
		}else {  
		System.out.println(city);  
		} 
		
		System.out.println("******nested if");
		String address = "Delhi, India";    
	    if(address.endsWith("Indiaa")) {    
		if(address.contains("Meerut")) {    
		System.out.println("Your city is Meerut");    
		}else if(address.contains("Noida")) {    
		System.out.println("Your city is Noida");    
		}else {    
		System.out.println(address.split(",")[0]);    
		}    
		}else {    
		System.out.println("You are not living in India");    
		} 
	    
	    System.out.println("*****switch case");
		int marks=44;
		switch (marks) {
		case 100:
			System.out.println("First class");
			break;
		case 75:
			System.out.println("second class");
			break;
		case 45:
			System.out.println("Pass");
			break;
		default:
			break;
		}
	}

}
