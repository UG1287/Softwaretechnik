import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GehaltRechnerTest {

	@Test
	void testberechneGehalt() {

		assertEquals(9.9, GehaltsRechner.berechneGehalt(
				"In zu vielen F�llen kann nicht so einfach eine Unit getestet werden, weil die Komponente zu viele Abh�ngigkeiten hat."));
//Pr�ft den Text auf Duplikate. Schl�gt fehl weil der entsprechende Code in der Klasse GehaltsRechner fehlt
		assertEquals(0, GehaltsRechner
				.berechneGehalt("Das liest sowieso niemand. Das liest sowieso niemand. Das liest sowieso keiner"));

		assertEquals(0, GehaltsRechner.berechneGehalt(""));

		Assertions.assertThrows(NullPointerException.class, () -> {
			GehaltsRechner.berechneGehalt(null);
		});
	}

}
