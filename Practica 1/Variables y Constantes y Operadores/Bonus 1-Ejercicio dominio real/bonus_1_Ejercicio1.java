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
import java.time.LocalDateTime;

public class bonus_1_Ejercicio1 {
    public static void main(String[] args) {
        LocalDateTime localDate = LocalDateTime.now();
        int dia = localDate.getDayOfMonth();
        int mes = localDate.getMonthValue();
        int año = localDate.getYear();
        int hours = localDate.getHour();
        int minutes = localDate.getMinute();
        int nroTicket;
        String CUIT;
        final String DNI="11.222.333"; //al tener puntos el número debe ser un String
        final String leyenda = "\"El precio lo pone el cliente\"";// String para palabras // ("\...\" para poner comillas dentro del texto)
        final String cajero = "Marcelo";
        final int caja=5;
        
        
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));// ingresa datos por teclado
            System.out.println("Nro de ticket: ");
            nroTicket = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese Nro de CUIT:");
            CUIT = String.valueOf(entrada.readLine());
            
            System.out.println('\b');
            System.out.println(dia + "/" + mes + "/" + año + " - " + hours + ":" + minutes+"  Ticket Nro. "+nroTicket);
            System.out.println('\b');
            System.out.println("CUIT: " + CUIT);
            System.out.println('\b');
            System.out.println("Cajero: " + cajero + " Caja: " + caja);
            System.out.println("DNI: " + DNI + "  " + leyenda);


        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}