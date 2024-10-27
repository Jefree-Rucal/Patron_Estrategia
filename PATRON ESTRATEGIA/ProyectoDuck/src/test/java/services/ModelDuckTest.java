package services;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ModelDuckTest {

   public ModelDuck d;
   public ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        d = new ModelDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void TestDisplay() {
    d.display();
    assertTrue(out.toString().toLowerCase().contains("soy un pato modelo"));
    }

    @Test
    public void TestSwim(){
        d.swim();
        assertTrue(out.toString().toLowerCase().contains("estoy nadando"));
    }

    @Test
    public void testCambiaMecanismoVoladorEnTiempoDeEjecucion(){
        d.performFly();
        assertTrue(out.toString().toLowerCase().contains("no puedo volar"));
        d.setFb(new FlyLikeRocket());
        d.performFly();
        assertTrue(out.toString().toLowerCase().contains("soy un pato explosivo"));
    }

    @Test
    public void testMuteSound(){
        d.performSound();
        assertTrue(out.toString().toLowerCase().contains("no hago quack"));
    }

    @Test
    public void testToString() {
    String esperado = "modelduck{}";
    String obtenido = d.toString().toLowerCase();
    assertEquals(esperado, obtenido);
    }
}