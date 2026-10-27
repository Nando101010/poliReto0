public class SN03 {

    // Fibonacci sobre impares: 0/1, 1/3, 1/5, 2/7, 3/9, 5/11, 8/13, ...
    // Imprime los primeros n términos de la serie.
    // Para n número de términos a mostrar  
    public void mostrarSN03(int n) {
        int a = 0, b = 1;
        int impar = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + "/" + impar + (i < n - 1 ? ", " : ""));
            int temp = a + b;
            a = b;
            b = temp;
            impar += 2;
        }
        System.out.println();
    }
}