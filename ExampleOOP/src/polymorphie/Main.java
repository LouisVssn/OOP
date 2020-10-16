package polymorphie;

public class Main {

	public static void main(String[] args) {

		Stift kugelschreiber = new Kugelschreiber("rot");

		Stift buntstift = new Buntstift("bunt");

		Stift wachsmalstift = new Wachsmalstift("pink");

		kugelschreiber.gebeSchreibfarbeAus();

		buntstift.gebeSchreibfarbeAus();

		wachsmalstift.gebeSchreibfarbeAus();

	}

}
