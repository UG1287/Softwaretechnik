import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
 
class KlasseBTest {
 
    KlasseB b;
 
    @Test
    void benötigteFarbe() {
        KlasseA A = mock(KlasseA.class); 
 
        when(A.Flächenrechner(10,10)).thenReturn(100);
 
        b = new KlasseB(A);

        assertEquals(100, b.benötigteFarbe(17));
 
    }
 
}