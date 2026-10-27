public class SN04 {

    // Fibonacci sobre pares: 0/2, 1/4, 1/6, 2/8, 3/10, 5/12, 8/14, ...
    // Imprime los primeros n términos de la serie.
    // Para n número de términos a mostrar
    public void mostrarSN04(int n) {
        int a = 0, b = 1;
        int par = 2;
        for (int i = 0; i < n; i++) {
            System.out.print(a + "/" + par + (i < n - 1 ? ", " : ""));
            int temp = a + b;
            a = b;
            b = temp;
            par += 2;
        }
        System.out.println();
    }
