package demo.pack;

public class DemoString {
	
	public static void main(String[] args) {
		String s="hello";
		String s1="hello";
		String s2=new String("hello");
		String s3=new String("hello");
		System.out.println(s==s1);
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s2));
		String m="Mounikananaji";
		System.out.println(m.substring(7));
		System.out.println(m.substring(1, 5));
		String d="Nani";
		char [] ee=d.toCharArray();
		System.out.println(ee);
		for(char i:ee) {
			System.out.println(i);
		}
	}

}
 