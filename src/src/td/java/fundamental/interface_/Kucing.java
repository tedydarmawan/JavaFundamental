package td.java.fundamental.interface_;

public class Kucing implements Binatang {
	
	@Override
	public void suara() {
		System.out.println("Meong...");
	}

	@Override
	public void info() {
		System.out.println("Kucing");
	}

}
