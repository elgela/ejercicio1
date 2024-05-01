/*Escribir un programa que pida se ingresen datos necesarios para
emitir una factura por la compra de dos artículos de librería (tipo
factura, número, nombre cliente, producto 1, importe 1, producto 2,
importe 2, importe total). Como salida debe imprimir por pantalla la
factura en un formato similar al del siguiente ejemplo:
Factura C N 249
Nombre: Juan Perez
Producto Importe
Lápiz 15.5
Papel 20.6
Importe total 36.1 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practica_1_Ejercicio6 {
    public static void main(String[] args) {
        char tipo_factura='C';
        int numero=249;
        String nombre_cliente, producto1, producto2;
        double importe1, importe2;

        try {
            BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Ingrese nombre del cliente:");
            nombre_cliente = entrada.readLine();
            System.out.println("Ingrese producto 1:");
            producto1 = entrada.readLine();
            System.out.println("Ingrese valor:");
            importe1 = Double.valueOf(entrada.readLine());
            System.out.println("Ingrese producto 2:");
            producto2 = entrada.readLine();
            System.out.println("Ingrese valor:");
            importe2 = Double.valueOf(entrada.readLine());
            System.out.println("Importe total" + "  " + (importe1 + importe2));


            System.out.println("Factura" + "\t" + tipo_factura + "\t\t" + "N" + "\t" + numero);
            System.out.println("Nombre: " + nombre_cliente);
            System.out.println("Producto" + "\t\t" + "Importe");
            System.out.println(producto1 + "\t\t" + importe1);
            System.out.println(producto2 + "\t\t" + importe2);
            System.out.println("Importe total" + "\t\t" + (importe1+importe2));
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
