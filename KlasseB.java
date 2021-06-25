
public class KlasseB {
	
	// Wieviel Farbe wird benötigt um die Wand zu streichen?
	
	KlasseA Fläche = new KlasseA();
	public KlasseB(KlasseA Fläche){this.Fläche=Fläche;}
	public double benötigteFarbe(double c) {
		double Farbmenge = Fläche.Flächenrechner(c, c)*0.17;
		return Farbmenge;
	}
}