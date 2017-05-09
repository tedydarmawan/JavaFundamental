package td.java.fundamental.static_;

public class MyClass {
	
	public static void main(String[] args){
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		
		System.out.println(Counter.COUNT); // bisa diganti c1.COUNT atau c2.COUNT
		System.out.println(c1.COUNT2);
		System.out.println(c2.COUNT2);
	}
	
}
