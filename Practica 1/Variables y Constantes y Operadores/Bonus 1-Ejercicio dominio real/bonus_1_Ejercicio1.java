/*La cadena de supermercados Carrefive debe imprimir el
encabezado del ticket de compra de los clientes con cierto formato
para cumplir las exigencias de la Administración Federal de
Ingresos PRIVADOS. En el mismo, debe figurar la fecha y hora,
número de ticket, CUIT, nombre del cajero, número de caja, dni
del cliente y la leyenda “El precio lo pone el cliente”. Un ejemplo
se muestra a continuación:
—-----------------------------------------------------------------
04/04/23 - 18:55 Ticket Nro. 3455674

CUIT: 99-34567833-9

Cajero: Luis Mercado Caja: 8
DNI: 33.333.333 “El precio lo pone el cliente”
—-----------------------------------------------------------------
Escribir un programa con declaración de constantes y variables
que pida al usuario el ingreso de los datos necesarios para
imprimir el encabezado del ticket. */

import java.io.*;
import java.util.Random;
public class bonus_1_Ejercicio1 {
    public static void main(String[] args) {
        final char fecha=02/04/24;
        final int CUIT=99-34567833-9;
        final byte nroCaja=8;
        final double hora=18.55;
        int ticketNro, dniCliente;
        String cajeroNombre;
        final String leyenda="El precio lo pone el cliente";//String para palabras
    
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));//ingresa datos por teclado
            
            System.out.println(fecha);System.out.println(hora);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}