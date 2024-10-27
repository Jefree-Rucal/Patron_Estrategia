package services;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FlyLikeRocketTest {

    public FlyLikeRocket d;
    public ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        d = new FlyLikeRocket();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testFlyLikeRocket() {
        d.fly();
        assertTrue(out.toString().toLowerCase().contains("soy un pato explosivo"));
    }

    @Test
    public void testToString() {
        String esperado = "flylikerocket{}";
        String obtenido = d.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}