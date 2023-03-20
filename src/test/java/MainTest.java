// package Test;
import static org.junit.Assert.*;
import org.example.Main;
import org.junit.Test;

public class MainTest {

    @Test
    public void testFindMax(){
        assertEquals(2.0,Main.calculate(1, 4), 0.001);
        assertEquals(120,(int)Main.calculate(2, 5));
    }
}  