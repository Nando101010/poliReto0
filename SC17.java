public class SC17 {
    // Símbolos cíclicos: +, -, *, /, %, +, -, *, /, %, ... hasta n términos.
    // Crea la serie y muestra sus primeros n términos.
    // Imprime los primeros n términos de la serie de símbolos cíclicos.
    // Para n número de términos a mostrar
    public void g1MostrarSC17(int n) {
        char[] simbolos = {'+', '-', '*', '/', '%'};
        for (int i = 0; i < n; i++) {
            System.out.print(simbolos[i % simbolos.length] + (i < n - 1 ? ", " : ""));
        }
        System.out.println();
    }
}
