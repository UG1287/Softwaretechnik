
public class GehaltsRechner {

	public static double berechneGehalt(String Buch) {
		double gehalt;
		double anzahlZeichen = Buch.replace(" ", "").length();
		gehalt = anzahlZeichen / 10;
		return gehalt;
	}

}
