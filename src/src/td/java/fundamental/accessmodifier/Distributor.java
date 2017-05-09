package td.java.fundamental.accessmodifier;

/*
 *  Access modifier
	default (blank) = atribut atau method hanya dapat diakses oleh kelas dalam package yang sama
	public 			= atribut atau method dapat diakses oleh kelas lain dimanapun
	protected		= seperti default, akan tetapi atribut atau method dapat diakses oleh kelas sub-kelas
	private			= atribut atau method hanya dapat diakses oleh kelas tersebut 
 */

// access modifier untuk class hanya bisa default & public
public class Distributor {
	String kode;
	public String nama;
	protected String alamat;
	private long bankGaransi;
	
	void show(){
		System.out.println("Show");
	}
	
	public void hide(){
		System.out.println("Hide");
	}
	
	protected void enable(){
		System.out.println("Enable");
	}
	
	private void disable(){
		System.out.println("Disable");
	}
}
