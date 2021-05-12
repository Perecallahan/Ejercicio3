package fechas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import java.text.ParseException;

/**
 *
 * @author Daniel Reguera Bazan
 */
public class TestBasico {
  
  public TestBasico() {
  }
  
  /**
   * IMPORTANTE. Pare comprobar el Test Presente, el día varía dependiendo de 
   * cuando se hace la prueba; hay que introducirlo (modificarlo) a mano o "arriesgarse" 
   * a usar la función de día actural (que sería la misma contra la que se comprueba...)
   * 
   * @throws ParseException 
   */
  
  /**
   * testPresente es la unica prueba de borde necesaria. Se espera que sea VALIDA
   * @throws ParseException 
   */
  @Test
    public void testPresente() throws ParseException{
        System.out.println("Presente. \n");
        Fechas instance = new Fechas();
        int expResult = 0;
        int result = instance.esFacturaCorrectaEnFecha("2021-05-12");
        assertEquals(expResult, result);
    }
    
    /**
     * Para comprobar si se producen errores, se puede descomentar este método
     * testAyerError. Se espera que NO sea VALIDA
     */
    
    /*@Test
    public void testAyerError() throws ParseException{
        System.out.println("Ayer (forzar error). \n");
        Fechas instance = new Fechas();
        int expResult = 0;
        int result = instance.esFacturaCorrectaEnFecha("2021-05-13");
        assertEquals(expResult, result);
    }*/
  
    /**
     * testFuturo es prueba de equivalencia. Se espera que NO sea VALIDA
     * @throws ParseException 
     */
  @Test
    public void testFuturo() throws ParseException{
        System.out.println("Futuro. \n");
        Fechas instance = new Fechas();
        int expResult = 1;
        int result = instance.esFacturaCorrectaEnFecha("2031-05-12");
        assertEquals(expResult, result);
    }
    
    /**
     * testPasado es prueba de equivalencia. Se espera que sea VALIDA
     * @throws ParseException 
     */
    @Test
    public void testPasado() throws ParseException{
        System.out.println("Pasado. \n");
        Fechas instance = new Fechas();
        int expResult = -1;
        int result = instance.esFacturaCorrectaEnFecha("2001-05-12");
        assertEquals(expResult, result);
    }
    
}
