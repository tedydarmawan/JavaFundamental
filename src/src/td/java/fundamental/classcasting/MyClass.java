package td.java.fundamental.classcasting;

public class MyClass {
	
	public static void main(String[] args){
		// Upcasting
		Binatang b = new Kucing();
		b.suara();
		
		// Downcasting
		if(b instanceof Kucing){
			((Kucing)b).suara();
		}
		
	}
	
}
