package services;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MakeSquickTest {

    public MakeSquick m;
    public ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        m = new MakeSquick();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testSound() {
        m.makeSoud();
        assertTrue(out.toString().toLowerCase().contains("squick"));
    }

    @Test
    public void testToString() {
        String esperado = "makesquick{}";
        String obtenido = m.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}