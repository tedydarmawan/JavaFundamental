package td.java.fundamental.method;

class MyClass {
	
	// method void
	static void halo(){
		System.out.println("Selamat datang");
	}
	
	// method void dengan parameter
	static void halo(String nama){
		System.out.println("Selamat datang " + nama);
	}
	
	// method return type dengan parameter
	static int sum(int angka1, int angka2){
		return angka1 + angka2;
	}
	
	public static void main(String[] args){
		halo();
		halo();
		halo();
		
		halo("Tedy");
		halo("Darmawan");
		
		int jumlah = sum(7,3);
		System.out.println(jumlah);
	}
	
}
