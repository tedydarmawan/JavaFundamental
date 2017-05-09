package td.java.fundamental.konstruktor;

public class Distributor {
	private String nama;
	
	public Distributor() {
		nama = "Demo";
	}
	
	Distributor(String nama){
		this.nama = nama;
	}
	
	public String getNama() {
		return nama;
	}
}
