package polymorphie;

public class Kugelschreiber extends Stift {

	public Kugelschreiber(String e) {
		schreibfarbe = e;

	}

	@Override
	public void gebeSchreibfarbeAus() {

		System.out.println("Farbe des Kugelschreibers ist " + schreibfarbe);
	}

}
