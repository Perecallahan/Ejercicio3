/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monto;



import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

/**
 *
 * @author Daniel
 */

/*NOTA IMPORTANTE: NO ME TERMINA DE IR. POSIBLEMENTE SE EXPORTARA MAL O ALGO...*/
@RunWith(value=Parameterized.class)
//@RunWith(Parameterized.class)
public class MontoParametroTest {
  private int a;
  private String resultado;
  
  public MontoParametroTest(int a, String resultado) {
    this.a = a;
    this.resultado = resultado;
  }
  
/*MENSAJES DE ERROR
  correcto = "Valor introducido correcto";
  errorInferior = "Error: La cantidad introducida es menor de 1";
  errorSuperior = "Error: La cantidad introducida es > 1000";
*/

/*CREAR ARRAY DE OBJETOS PARA PASAR TODAS LAS PREUBAS POR UN ÚNICO MÉTODO*/
  
  @Parameters
  public static Iterable<Object[]> getData() {
      List<Object[]> obj = new ArrayList<>();
      //objetos de preubas de equivalencia
      obj.add(new Object[] {333,"Valor introducido correcto"});
      obj.add(new Object[] {-4444,"Error: La cantidad introducida es menor de 1"});
      obj.add(new Object[] {4444,"Error: La cantidad introducida es > 1000"});
      //objetos de pruebas de borde
      obj.add(new Object[] {1,"Valor introducido correcto"});
      obj.add(new Object[] {0,"Error: La cantidad introducida es menor de 1"});
      obj.add(new Object[] {1000,"Valor introducido correcto"});
      obj.add(new Object[] {1001,"Error: La cantidad introducida es > 1000"});
      
      return obj;
  }
  
  
  @Test
  public void testAdd(){
    System.out.println("ingreso");
    int cantidad = a;
    Monto instance = new Monto();
    String expResult = resultado;
    String result = instance.ingreso(cantidad);
    assertEquals(expResult, result); 
  }
}
