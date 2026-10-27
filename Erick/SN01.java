public class SN01 {

    // Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, ...
    // Imprime los primeros n términos de la serie de Fibonacci.
    // Para n número de términos a mostrar
    public void g1MostrarSN01(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + (i < n - 1 ? ", " : ""));
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }
}