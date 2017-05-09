package td.java.fundamental.konstruktor;

public class MyClass {
	
	public static void main(String[] args){
		Distributor d1 = new Distributor();
	    Distributor d2 = new Distributor("Maju Makmur Mandiri (3M)");
	    
	    System.out.println(d1.getNama());
	    System.out.println(d2.getNama());
	}
	
}
