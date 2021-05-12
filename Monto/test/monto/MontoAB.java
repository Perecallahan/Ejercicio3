/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 */
public class MontoAB {
  
  private static Monto instance;
  
  
  public MontoAB() {
  }
  
  //Así sería un test antes de optimizar
  /*@Test
  public void equivalencia2() {
    System.out.println("Presunto ingreso válido: -4444");
    int cantidad = -4444;
    Monto instance = new Monto();
    String expResult = "Error: La cantidad introducida es menor de 1";
    String result = instance.ingreso(cantidad);
    assertEquals(expResult, result);
    //fail("The test case is a prototype.");
  }*/
  
  /*SIMPLIFICAMOS UN POCO CON LOS BEFORE/AFTER*/
  
  @Before
  public void Before() {
    System.out.println("Before");
    instance = new Monto();
  }
  
  @After
  public void After() {
    System.out.println("After");
    instance = null;
  }
  
  //Prueva de quivalencia1
    //Pasar valor valido 333
  @Test
  public void quivalencia1() {
    System.out.println("Cantidad: 333");
    int cantidad = 333;
    String expResult = "Valor introducido correcto";
    String result = instance.ingreso(cantidad);
    assertEquals(expResult, result);
    //fail("The test case is a prototype.");
  }
  
  //Prueva de equivalencia2
    //Pasar valor no valido de -4444
  @Test
  public void equivalencia2() {
    System.out.println("Cantidad: -4444");
    int cantidad = -4444;
    String expResult = "Error: La cantidad introducida es menor de 1";
    String result = instance.ingreso(cantidad);
    assertEquals(expResult, result);
    //fail("The test case is a prototype.");
  }
  
  //Prueva de equivalencia3
    //Pasar valor no valido de 4444
  @Test
  public void equivalencia3() {
    System.out.println("Cantidad: 4444");
    int cantidad = 4444;
    String expResult = "Error: La cantidad introducida es > 1000";
    String result = instance.ingreso(cantidad);
    assertEquals(expResult, result);
    //fail("The test case is a prototype.");
  }
  
  /*Pruebas de borde*/
  
  //Prueva de borde1
    //valido 1
  @Test
  public void borde1() {
    System.out.println("Cantidad: 1");
    int cantidad = 1;
    String expResult = "Valor introducido correcto";
    String result = instance.ingreso(cantidad);
    assertEquals(expResult, result);
    //fail("The test case is a prototype.");
  }
  
  //Prueva de borde2
    //valido 1000
  @Test
  public void borde2() {
    System.out.println("Cantidad: 0");
    int cantidad = 0;
    String expResult = "Error: La cantidad introducida es menor de 1";
    String result = instance.ingreso(cantidad);
    assertEquals(expResult, result);
    //fail("The test case is a prototype.");
  }
  
  //Prueva de borde3
    //valido 1000
  @Test
  public void borde3() {
    System.out.println("Cantidad: 1000");
    int cantidad = 1000;
    String expResult = "Valor introducido correcto";
    String result = instance.ingreso(cantidad);
    assertEquals(expResult, result);
    //fail("The test case is a prototype.");
  }
  
  //Prueva de borde4
    //invalido 1001
  @Test
  public void borde4() {
    System.out.println("Cantidad: 1001");
    int cantidad = 1001;
    String expResult = "Error: La cantidad introducida es > 1000";
    String result = instance.ingreso(cantidad);
    assertEquals(expResult, result);
    //fail("The test case is a prototype.");
  }
  
}
