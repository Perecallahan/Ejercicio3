/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.text.ParseException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 */
public class beforeAfter {
  private static Fechas instance;
  public beforeAfter() {
  }
  
  @Before
  public void before() {
    
    System.out.println("Before");
    instance = new Fechas();
  }
  
  @After
  public void after() {
    
    System.out.println("After \n");
    instance = null;
  }
  
  /**
   * IMPORTANTE. Pare comprobar el Test Presente, el día varía dependiendo de 
   * cuando se hace la prueba; hay que introducirlo (modificarlo) a mano o "arriesgarse" 
   * a usar la función de día actural (que sería la misma contra la que se comprueba...)
   * 
   * @throws ParseException 
   */
  @Test
    public void testPresente() throws ParseException{
        System.out.println("Presente.");
        int expResult = 0;
        int result = instance.esFacturaCorrectaEnFecha("2021-05-12");
        assertEquals(expResult, result);
    }
    
    /**
     * Para comprobar si se producen errores, se puede descomentar este método
     * testAyerError
     */
    
    /*@Test
    public void testAyerError() throws ParseException{
        System.out.println("Ayer (forzar error).");
        int expResult = 0;
        int result = instance.esFacturaCorrectaEnFecha("2021-05-13");
        assertEquals(expResult, result);
    }*/
  
  @Test
    public void testFuturo() throws ParseException{
        System.out.println("Futuro.");
        int expResult = 1;
        int result = instance.esFacturaCorrectaEnFecha("2031-05-12");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPasado() throws ParseException{
        System.out.println("Pasado.");
        int expResult = -1;
        int result = instance.esFacturaCorrectaEnFecha("2001-05-12");
        assertEquals(expResult, result);
    }
    
}
