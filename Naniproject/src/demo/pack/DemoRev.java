package demo.pack;

public class DemoRev {
	
	public static void main(String[] args) {
		
		String s="hi this is nani";
		
		String [] a =s.split(" ");
		for(String b:a) {
			System.out.println(b);
		}
		
		String c="Hello World";
		String op="";
		String [] d=c.split(" ");
		for(String e:d) {
			for(int i=e.length()-1;i>=0;i--) {
				op=op+e.charAt(i);
			}
		}
		System.out.println(op);
		
		String n="nanaji";
		String rev="";
		for(int i=n.length()-1;i>=0;i--) {
			rev=rev+n.charAt(i);
		}
		System.out.println(rev);
	}

}
