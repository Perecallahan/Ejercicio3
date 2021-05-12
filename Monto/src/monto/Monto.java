/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monto;

/**
 *
 * @author javier Bustamante
 * 
 * Ssituación: Supongamos que tenemos una aplicación que posee una
 * pantalla para el ingreso de un valor numérico, como por ejemplo un monto (en alguna moneda),
 * cuyo valor debe estar entre 1 y 1.000. Por lo tanto, todo valor menor que 1 y mayor a 1.000 es
 * invalido.
 * 
 */
public class Monto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public String ingreso (int cantidad) {
        String sRespuesta = "Error desconocido";
        
            if (cantidad >= 1 && cantidad <=1000) {
                sRespuesta = "Valor introducido correcto";
            } else if (cantidad < 1) {
                sRespuesta = "Error: La cantidad introducida es menor de 1";
            } else {
                sRespuesta= "Error: La cantidad introducida es > 1000";
            }
        
        return sRespuesta;
    }
}
/*
Prueva de quivalencia1
    Pasar valor valido 333
Prueva de equivalencia2
    Pasar valor no valido de -4444
Prueva de equivalencia3
    Pasar valor no valido de 4444

Prueva de borde1
    valido 1
Prueva de borde2
    invalido 0
Prueva de borde3
    valido 1000
Prueva de borde4
    invalido 1001
    

Nota día del examen: me he liado intentado crear los String en la class y 
meterlos en los objetos, y de ahí no he levantado cabeza :(

*/
