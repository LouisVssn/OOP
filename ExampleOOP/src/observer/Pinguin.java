package observer;

import java.util.ArrayList;
import java.util.List;

public class Pinguin implements Subjekt {

	private String aktion;

	private List<Beobachter> beobachterlist = new ArrayList<Beobachter>();

	@Override
	public void registriereBeobachter(Beobachter beobachter) {
		this.beobachterlist.add(beobachter);

	}

	@Override
	public void entferneBeobachter(Beobachter beobachter) {
		this.beobachterlist.remove(beobachter);

	}

	@Override
	public void benachrichtigeBeobachter() {
		for (Beobachter beobachter : beobachterlist) {
			beobachter.aktualisiere();
		}

	}

	public String getAktion() {
		return aktion;
	}

	public void setAktion(String aktion) {
		this.aktion = aktion;
		this.benachrichtigeBeobachter();
	}

}
