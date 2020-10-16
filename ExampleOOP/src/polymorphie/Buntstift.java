package polymorphie;

public class Buntstift extends Stift {

	public Buntstift(String e) {
		schreibfarbe = e;
	}

	@Override
	public void gebeSchreibfarbeAus() {

		System.out.println("Farbe des Bunstifts ist " + schreibfarbe);
	}
}
