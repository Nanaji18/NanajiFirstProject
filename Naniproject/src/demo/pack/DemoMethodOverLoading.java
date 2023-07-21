package demo.pack;

public class DemoMethodOverLoading {
	
	
	public int  add(int a) {
		System.out.println("the number is "+ a);
		return a;
	}
	
	public int  add(int a , int b) {
		int c=a+b;
		System.out.println(c);
		return c;
	}
	public void add(float a , float b) {
		float c=a+b;
		System.out.println(c);
	}
	
	
	public static void add(int a, int b,int c) {
		int d=a+b+c;
		
		System.out.println(d);;
	}
	
	
	public static void main(String[] args) {
		
		DemoMethodOverLoading obj=new DemoMethodOverLoading();
		obj.add(1);
		obj.add(1, 2);
		obj.add(0,0);
		add(1, 2, 3);
	}
}
