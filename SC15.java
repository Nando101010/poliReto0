public class SC15 {

    // Bloques de asteriscos: *, **, ***, ****, ... hasta n bloques.
    // Imprime los primeros n bloques de asteriscos.
    // Para n número de bloques a mostrar
    public void g1MostrarSC15(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
