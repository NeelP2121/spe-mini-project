// package Test;
import static org.junit.Assert.*;
import org.example.Main;
import org.junit.Test;

public class MainTest {

	Main obj = new Main();
    @Test
    public void testFindMax(){
	assertEquals("Testing Square Root ", 2.0, obj.calcSqrt(4.0), 0.001);
	assertEquals("Testing Factorual ", 120, obj.calcFactorial(5));
	assertEquals("Testing Natural Logarithm ", 2.30258509299, obj.calcLogarithm(10.0), 0.001);
	assertEquals("Testing Power function ", 8.0, obj.calcPower(2, 3), 0.001);
    }
}  
