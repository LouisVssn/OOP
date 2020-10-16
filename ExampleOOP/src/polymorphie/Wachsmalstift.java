package polymorphie;

public class Wachsmalstift extends Stift {

	public Wachsmalstift(String e) {

		schreibfarbe = e;
	}

	@Override
	public void gebeSchreibfarbeAus() {

		System.out.println("Farbe des Wachsmalstifts ist " + schreibfarbe);

	}
}
