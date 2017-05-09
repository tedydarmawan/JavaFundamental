package td.java.fundamental.anonymous;

public class MyClass {

	public static void main(String[] args){
		Mesin m1 = new Mesin(){
			@Override
			public void mulai() {
				System.out.println("Berhasil di override...");
			}
		};
		m1.mulai();
		
		Mesin m2 = new Mesin();
		m2.mulai();
	}
	
}
