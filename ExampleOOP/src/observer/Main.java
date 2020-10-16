package observer;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Pinguin pingu = new Pinguin();

		Forscher forscherManuel = new Forscher("Hans", pingu);
		Forscher forscherFranz = new Forscher("Franz", pingu);

		pingu.setAktion("schlafen");
		System.out.println();
		pingu.setAktion("isst");
		System.out.println();
		pingu.setAktion("witschelt");

	}

}
