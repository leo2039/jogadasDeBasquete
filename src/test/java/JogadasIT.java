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
public class JogadasIT {
    
    public JogadasIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getJogos method, of class Jogadas.
     */
    @Test
    public void testGetJogos() {
        System.out.println("getJogos");
        Jogadas instance = new Jogadas();
        int expResult = 0;
        int result = instance.getJogos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJogos method, of class Jogadas.
     */
    @Test
    public void testSetJogos() {
        System.out.println("setJogos");
        int jogos = 0;
        Jogadas instance = new Jogadas();
        instance.setJogos(jogos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
