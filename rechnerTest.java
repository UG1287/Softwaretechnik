import static org.junit.jupiter.api.Assertions.*;
 
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class rechnerTest {

	@Test
	void testAddition() {
	assertEquals(5, rechner.Addition(2, 3));
	}

	@Test
	void testSubtraktion() {
	assertEquals(-1, rechner.Subtraktion(2, 3));
	}

	@Test
	void testMultiplikation() {
	assertEquals(6, rechner.Multiplikation(2, 3));
	}

	@Test
	void testDivision() {
	assertEquals(0, rechner.Division(2, 3));
	Assertions.assertThrows(ArithmeticException.class,()->{rechner.Division(0,0);});
	}

}
