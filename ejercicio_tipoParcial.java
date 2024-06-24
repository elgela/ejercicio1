/*Cuando se debe procesar texto expresado en lenguaje natural, una de las primeras tareas que se realiza es la
de eliminación de stopwords. Las stopwords son palabras muy comunes en un determinado lenguaje, por
ejemplo, artículos (el, la, las, los...), preposiciones (a, ante, con, por...), etc.
Dado un texto almacenado en un arreglo de caracteres de tamaño MAX_A, donde cada palabra está
delimitada por espacios, comas (,) o puntos (.) se pide eliminar todas las stopwords almacenadas en otro
arreglo de caracteres de tamaño MAX_S que se encuentra delimitado por espacios.
Por ejemplo, dado un texto almacenado en un arreglo A:

| |l|a| |c|a|s|a| |r|o|j|a|,| |a| |l|a| |v|u|e|l|t|a| |d|e| |l|a| |e|s|q|u|i|n|a|.|  = 41

Y una lista de stopwords S

| |a| |l|o| |l|o|s| |d|e| |l|a| |l|a|s| |  = 20

El arreglo A debería quedar de la siguiente forma luego de la eliminación de stopwords:
| | |c|a|s|a| |r|o|j|a| ,| |v|u|e|l|t|a| |e|s|q|u|i|n|a|.| 
*/

public class ejercicio_tipoParcial {
    final static char MAX_A = 41, MAX_S = 20;

    public static void main(String[] args) {
        char[] arrA = { 'l', 'a', 'c', 'a', 's', 'a', 'r', 'o', 'j', 'a', ',', 'a', 'l', 'a', 'v', 'u', 'e', 'l', 't',
                'a', 'd', 'e', 'l', 'a', 'e', 's', 'q', 'u', 'i', 'n', 'a' };
        char[] arrS = { 'a', 'l', 'o', 'l', 'o', 's', 'd', 'e', 'l', 'a', 'l', 'a', 's' };
        int ini = 0, fin = -1;

        
    }
}