import java.util.Scanner;

public class SeriesNumericas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de términos (n): ");
        int n = sc.nextInt();
        System.out.println("\n--- RESULTADOS DE LAS SERIES NUMÉRICAS ---");

        System.out.print("SN05 (Primos): ");
        sN05(n);

        System.out.print("SN06 (Cuadrados perfectos): ");
        sN06(n);

        System.out.print("SN14 (Signos alternos): ");
        sN14(n);

        System.out.print("SN15 (Cuadrados desplazados): ");
        sN15(n);

        System.out.print("SN16 (Repunidades): ");
        sN16(n);

        System.out.print("SN17 (Números de Lucas): ");
        sN17(n);

        System.out.print("SN18 (Crecientes): ");
        sN18(n);

        System.out.print("SN19 (Alternancias): ");
        sN19(n);

        sc.close();
    }

    // SN05
    public static void sN05(int n) {
        int contador = 0, num = 2;
        while (contador < n) {
            if (esPrimo(num)) {
                System.out.print(num + " ");
                contador++;
            }
            num++;
        }
        System.out.println();
    }

    public static boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // SN06
    public static void sN06(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print((i * i) + " ");
        }
        System.out.println();
    }

    // SN14
    public static void sN14(int n) {
        for (int i = 1; i <= n; i++) {
            int term = (i % 2 != 0) ? i : -i;
            System.out.print(term + " ");
        }
        System.out.println();
    }

    // SN15
    public static void sN15(int n) {
        for (int i = 1; i <= n; i++) {
            int term = 2 * (int) Math.pow(i - 1, 2);
            System.out.print(term + " ");
        }
        System.out.println();
    }

    // SN16
    public static void sN16(int n) {
        long term = 0;
        for (int i = 1; i <= n; i++) {
            term = term * 10 + 1;
            System.out.print(term + " ");
        }
        System.out.println();
    }

    // SN17
    public static void sN17(int n) {
        if (n <= 0) return;
        long a = 2, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            long siguiente = a + b;
            a = b;
            b = siguiente;
        }
        System.out.println();
    }

    // SN18
    public static void sN18(int n) {
        int term = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term += i; 
        }
        System.out.println();
    }

    // SN19
    public static void sN19(int n) {
        for (int i = 1; i <= n; i++) {
            int term;
            if (i % 2 != 0) {
                int k = (i + 1) / 2;
                term = k * k;       
            } else {
                int k = i / 2;
                term = k * k * k;   
            }
            System.out.print(term + " ");
        }
        System.out.println();
    }
}