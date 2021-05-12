/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Daniel
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
  fechas.TestBasico.class,
  fechas.beforeAfter.class, 
  fechas.beforeAfterClass.class,
  fechas.parametrizada.class,             
  
})
public class TestSuite {
  
}
