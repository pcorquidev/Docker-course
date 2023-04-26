
import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testSumar() {
        Main myClass = new Main();
        int resultado = myClass.sumar(2, 3);
        assertEquals(5, resultado);
    }
}