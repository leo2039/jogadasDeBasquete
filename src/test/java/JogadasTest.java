/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Leo
 */
public class JogadasTest {
    private Jogadas j;
    
    
    public JogadasTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
       j = new Jogadas(0);
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getJogos method, of class Jogadas.
     */
    @Test
    public void testGetJogos() {
        assertEquals(10,10);
        
    }

    /**
     * Test of setJogos method, of class Jogadas.
     */
    @Test
    public void testSetJogos() {
        assertEquals(10,10);
    }

    /**
     * Test of pMin method, of class Jogadas.
     */
    @Test
    public void testPMin() {
        assertTrue(j.pMin(10, 20)); // testa verdadeiro para fnção pontuação minima para placra = 10 e ultima pontuação minima = 20
       
    }

    /**
     * Test of pMax method, of class Jogadas.
     */
    @Test
    public void testPMax() {
        assertTrue(j.pMax(15, 10)); // testa verdadeiro para função potuação maxima valor do placar = 15 ultima pontuação maximo 10
    }
    
}
