package demo.parallel;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ComplexTest {

    @Test
    public void testDivide() {
        Complex a = new Complex(4, 2);
        Complex b = new Complex(1, -1);
        a.divide(b);
        assertEquals(1.5, a.getReal(), 1e-9);
        assertEquals(3.5, a.getImaginary(), 1e-9);
    }

    @Test
    public void testModulus() {
        Complex a = new Complex(3, 4);
        assertEquals(5.0, a.modulus(), 1e-9);
    }

    @Test
    public void testNewFractalEquation() {
        Complex c = new Complex(0.355, 0.355);
        Complex z = new Complex(0, 0);

        Complex numerator = z.cubePlus(c);
        double denominator = z.modulus() + 1;
        z = numerator.divide(new Complex(denominator, 0));

        assertNotNull(z);
    }
}