public class SN02 {

    // Impares alternados con cero: 1, 0, 3, 0, 5, 0, 7, 0, 9, ...
    // Imprime los primeros n términos de la serie.
    // Para n número de términos a mostrar
    public void g1MostrarSN02(int n) {
        int impar = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(impar);
                impar += 2;
            } else {
                System.out.print(0);
            }
            if (i < n) System.out.print(", ");
        }
        System.out.println();
    }
}