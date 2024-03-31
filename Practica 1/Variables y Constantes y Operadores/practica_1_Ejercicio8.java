/*Escribir un programa que imprima por pantalla la tabla de verdad
para los operadores lógicos or y and (por separado) para dos
valores booleanos. Utilizar los operadores para calcular el
resultado. Por ejemplo, imprimir el siguiente caso para el operador
or:
false or true es: true
y se genera con:
System.out.println(“ false or true es: ” + (false || true)); */

public class practica_1_Ejercicio8 {
    public static void main(String[] args) {
        operador_logico_and();
        System.out.println('\0');
        operador_logico_or();
    }
    @SuppressWarnings("unused") //esto hace que no aparezca el Dead code
    public static void operador_logico_or() {
        System.out.println("Tabla de verdad de la disyunción (or)");
        System.out.println('\0');
        System.out.println("true OR true es: " + (true||true));
        System.out.println("true OR false es: " + (true||false));
        System.out.println("false OR true es: " + (false||true));
        System.out.println("false OR false es: " + (false||false));
    }
    @SuppressWarnings("unused")
    public static void operador_logico_and() {
        System.out.println("Tabla de verdad de la conjunción (and)");
        System.out.println('\0');
        System.out.println("true AND true es: " + (true&&true));
        System.out.println("true AND false es: " + (true&&false));
        System.out.println("false AND true es: " + (false&&true));
        System.out.println("false AND false es: " + (false&&false));
    }
}
