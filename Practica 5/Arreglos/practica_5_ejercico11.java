/*Dado dos arreglos de números enteros A y B determinar si
todos los números almacenados en el arreglo A están presentes
en el arreglo B. */

public class practica_5_ejercico11 {
    final static int MAX = 3;
    public static void main(String[] args) {
        int[] arrA = {1,2,3};
        int[] arrB = {1,2,3};
        System.out.println('\0');
        numeros_presentes(arrA, arrB);
    }
    public static void numeros_presentes(int[] arrA, int[] arrB) {
        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < MAX; j++) {
                if (arrA[i] == arrB[j]) {
                    System.out.println();
                } else {
                    System.out.println();
                }
            }
        }
    }
}
