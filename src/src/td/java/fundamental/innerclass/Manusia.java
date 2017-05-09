package td.java.fundamental.innerclass;

public class Manusia {
	String nama;
	
	Manusia(String n){
		nama = n;
		Otak o = new Otak();
		o.berfikir();
	}
	
	class Otak{
		public void berfikir(){
			System.out.println(nama + " sedang berfikir");
		}
	}
	
	public static void main(String[] args){
		new Manusia("Tedy Darmawan");
	}
}
