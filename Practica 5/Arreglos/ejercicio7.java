public class ejercicio7 {
    final static int MAX = 8;
    public static void main(String[] args) {
        int[] arrenteros = new int[MAX];
        int N = 10, M = 5;
        for (int pos = 0; pos < MAX; pos++) {
            if (arrenteros[pos] == N) {
                int[] posicionN = new int[pos];
                arrenteros[MAX] = posicionN[pos] * M;
            }
        }
        System.err.println('\0');
        System.out.println(arrenteros[MAX]);
    }
}
