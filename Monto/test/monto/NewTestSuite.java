/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * originalmente, en el examen, parece ser que se borró el package...
 */
package monto;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author danielreguera
 */

/**
 * DAMOS ORDEN A LOS TEST
 */

@RunWith(value = Suite.class)
@Suite.SuiteClasses({
    monto.MontoIT.class,
    monto.MontoAB.class,
    monto.MontoABClass.class,
    monto.MontoParametroTest.class,
    
})
public class NewTestSuite {

   
    
}
