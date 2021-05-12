/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.text.ParseException;
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
@RunWith(value=Parameterized.class)
public class parametrizada {
  
  private String fechaPrueba;
  private int resultadoEsperado;
  private static int contadorTiempo =0;
  private String tiempo [] = {"Presente", "Futuro", "Pasado"};
  
  public parametrizada( String fecha, int valor) {
    this.fechaPrueba = fecha;
    this.resultadoEsperado = valor;
  }
  
  @Parameters
  public static Iterable<Object> obtenerPrueba(){
    List<Object> obj = new ArrayList<>();
      //Presente, futuro y pasado
      obj.add(new Object[] {"2021-05-12", 0 });
      obj.add(new Object[] {"2031-05-12", 1 });
      obj.add(new Object[] {"2001-05-12", -1 });   
      return obj;
  }
  
  @Test
    public void testPresente() throws ParseException{
        
        System.out.println(tiempo[contadorTiempo]);
        Fechas instance = new Fechas();
        int expResult = this.resultadoEsperado;
        int result = instance.esFacturaCorrectaEnFecha(this.fechaPrueba);
        assertEquals(expResult, result);
        System.out.println(this.fechaPrueba+"--> "+expResult+" \n");
        contadorTiempo++;
        
    }
}
