/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monto;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 */
public class MontoIT {
  
  public MontoIT() {
  }

  /**
   * Test of main method, of class Monto.
   */
  @Test
  public void testMain() {
    System.out.println("main");
    String[] args = null;
    Monto.main(args);
    //fail("The test case is a prototype.");
  }

  /**
   * Test of ingreso method, of class Monto.
   */
  
  /*EJECUTAMOS LAS PRUEBAS UNA A UNA*/
  
  //Prueva de quivalencia1
    //Pasar valor valido 333
  @Test
  public void quivalencia1() {
    System.out.println("Cantidad: 333");
    int cantidad = 333;
    Monto instance = new Monto();
    String expResult = "Valor introducido correcto";
    String result = instance.ingreso(cantidad);
    assertEquals(expResult, result);
  }
  
  //Prueva de equivalencia2
    //Pasar valor no valido de -4444
  @Test
  public void equivalencia2() {
    System.out.println("Cantidad: -4444");
    int cantidad = -4444;
    Monto instance = new Monto();
    String expResult = "Error: La cantidad introducida es menor de 1";
    String result = instance.ingreso(cantidad);
    assertEquals(expResult, result);
  }
  
  //Prueva de equivalencia3
    //Pasar valor no valido de 4444
  @Test
  public void equivalencia3() {
    System.out.println("Cantidad: 4444");
    int cantidad = 4444;
    Monto instance = new Monto();
    String expResult = "Error: La cantidad introducida es > 1000";
    String result = instance.ingreso(cantidad);
    assertEquals(expResult, result);
  }
  
  /*Pruebas de borde*/
  
  //Prueva de borde1
    //valido 1
  @Test
  public void borde1() {
    System.out.println("Cantidad: 1");
    int cantidad = 1;
    Monto instance = new Monto();
    String expResult = "Valor introducido correcto";
    String result = instance.ingreso(cantidad);
    assertEquals(expResult, result);
  }
  
  //Prueva de borde2
    //valido 1000
  @Test
  public void borde2() {
    System.out.println("Cantidad: 0");
    int cantidad = 0;
    Monto instance = new Monto();
    String expResult = "Error: La cantidad introducida es menor de 1";
    String result = instance.ingreso(cantidad);
    assertEquals(expResult, result);
  }
  
  //Prueva de borde3
    //valido 1000
  @Test
  public void borde3() {
    System.out.println("PCantidad: 1000");
    int cantidad = 1000;
    Monto instance = new Monto();
    String expResult = "Valor introducido correcto";
    String result = instance.ingreso(cantidad);
    assertEquals(expResult, result);
  }
  
  //Prueva de borde4
    //invalido 1001
  @Test
  public void borde4() {
    System.out.println("Cantidad: 1001");
    int cantidad = 1001;
    Monto instance = new Monto();
    String expResult = "Error: La cantidad introducida es > 1000";
    String result = instance.ingreso(cantidad);
    assertEquals(expResult, result);
  }
  
}
