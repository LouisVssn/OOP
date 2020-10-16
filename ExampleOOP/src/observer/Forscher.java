package observer;

public class Forscher implements Beobachter {

	private String name;
	private Pinguin pinguin;

	public Forscher(String name, Pinguin pinguin) {
		this.name = name;
		this.pinguin = pinguin;
		pinguin.registriereBeobachter(this);
	}

	@Override
	public void aktualisiere() {
		System.out.println("Der Forscher " + name + " sieht, dass der Pinguin gerade " + pinguin.getAktion());
	}

}
