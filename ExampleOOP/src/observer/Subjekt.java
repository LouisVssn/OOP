package observer;

public interface Subjekt {

	public abstract void registriereBeobachter(Beobachter beobachter);

	public abstract void entferneBeobachter(Beobachter beobachter);

	public abstract void benachrichtigeBeobachter();
}
