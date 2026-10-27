public class SC16 {

    // Alternancia minúscula / Mayúscula: a, B, c, D, e, F, ... hasta n términos.
    // Imprime los primeros n términos alternando mayúsculas y minúsculas.
    // Para n número de términos a mostrar
    public void g1MostrarSC16(int n) {
        for (int i = 0; i < n; i++) {
            char letra = (char) ('a' + i);
            if (i % 2 != 0) {
                letra = Character.toUpperCase(letra);
            }
            System.out.print(letra + (i < n - 1 ? ", " : ""));
        }
        System.out.println();
    }
