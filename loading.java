package pkgPoliretos2;

import java.util.Random;
import java.util.Scanner;

public class loading {

    private final Random random = new Random();

    public void menuIndividual() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ LOADING ---");
            System.out.println("1. Indicador rotacional (\\ | / -)");
            System.out.println("2. Barra de longitud personalizada con [###]");
            System.out.println("3. Carácter desplazándose de izq a der");
            System.out.println("4. Waiting 'o0o' de ida y vuelta");
            System.out.println("5. Barra avanzando con punta cambiante (> -)");
            System.out.println("6. Bloque '<=>' desplazándose");
            System.out.println("7. Barra con rotación en la punta");
            System.out.println("8. Carga mostrando nombre letra a letra");
            System.out.println("9. Nombre mostrando una letra por línea");
            System.out.println("10. Descarga de archivo en kB con barra (━)");
            System.out.println("11. Señales de audio simétricas y barras (≡)");
            System.out.println("12. Desplazamiento de figura artística");
            System.out.println("0. Regresar al menú principal");
            System.out.print("Elija el reto L (1-12): ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 12) {
                System.out.print("Ingrese el número de términos / niveles / límite: ");
                int paramDinamico = sc.nextInt();

                switch (opcion) {
                    case 1: eatL01(paramDinamico); break;
                    case 2: eatL02(paramDinamico); break;
                    case 3: eatL03(paramDinamico); break;
                    case 4: eatL04(paramDinamico); break;
                    case 5: eatL05(paramDinamico); break;
                    case 6: eatL06(paramDinamico); break;
                    case 7: eatL07(paramDinamico); break;
                    case 8: eatL08(); break;
                    case 9: eatL09(); break;
                    case 10: eatL10(paramDinamico); break;
                    case 11: eatL11(paramDinamico); break;
                    case 12: eatL12(paramDinamico); break;
                }
            } else if (opcion != 0) {
                System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
        sc.close();
    }

    public void eatL01(int maxTerminos) {
        char[] simbolos = {'\\', '|', '/', '-'};
        try {
            for (int i = 0; i <= maxTerminos; i++) {
                char simbolo = simbolos[i % simbolos.length];
                System.out.print("\r " + simbolo + " " + i + "% ");
                Thread.sleep(40);
            }
            System.out.println("\n¡Finalizado!");
        } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }

    public void eatL02(int longitudBarra) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese carácter para la barra (ej. #): ");
        char car = sc.next().charAt(0);
        try {
            for (int i = 0; i <= 100; i += 5) {
                int filled = (i * longitudBarra) / 100;
                StringBuilder b = new StringBuilder("[");
                for (int j = 0; j < longitudBarra; j++) b.append(j < filled ? car : " ");
                b.append("] ").append(i).append("%");
                System.out.print("\r" + b.toString());
                Thread.sleep(80);
            }
            System.out.println("\n¡Finalizado!");
        } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }

    public void eatL03(int pasos) {
        try {
            for (int i = 0; i <= pasos; i++) {
                StringBuilder b = new StringBuilder("[");
                for (int j = 0; j < pasos; j++) {
                    b.append(j == i && i < pasos ? "-" : " ");
                }
                b.append("] ").append((i * 100) / pasos).append("%");
                System.out.print("\r" + b.toString());
                Thread.sleep(80);
            }
            System.out.println("\n¡Finalizado!");
        } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }

    public void eatL04(int iteraciones) {
        String[] estados = {"o0o", "0o0", "00o", "o00"};
        try {
            for (int i = 0; i <= iteraciones; i++) {
                String estado = estados[(i / 5) % estados.length];
                System.out.print("\r" + estado + " " + ((i * 100) / iteraciones) + "% ");
                Thread.sleep(50);
            }
            System.out.println("\n¡Finalizado!");
        } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }

    public void eatL05(int longitudBarra) {
        try {
            for (int i = 0; i <= longitudBarra; i++) {
                StringBuilder b = new StringBuilder("[");
                for (int j = 0; j < longitudBarra; j++) {
                    if (j < i) b.append("=");
                    else if (j == i) b.append(i % 2 == 0 ? ">" : "-");
                    else b.append(" ");
                }
                b.append("] ").append((i * 100) / longitudBarra).append("%");
                System.out.print("\r" + b.toString());
                Thread.sleep(80);
            }
            System.out.println("\n¡Finalizado!");
        } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }

    public void eatL06(int longitudBarra) {
        try {
            for (int i = 0; i <= longitudBarra - 2; i++) {
                StringBuilder b = new StringBuilder("[");
                for (int j = 0; j < longitudBarra; j++) {
                    if (j >= i && j < i + 2) {
                        b.append("<=>");
                        j++;
                    } else {
                        b.append(" ");
                    }
                }
                b.append("] 50%");
                System.out.print("\r" + b.toString());
                Thread.sleep(80);
            }
            System.out.println("\n¡Finalizado!");
        } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }

    public void eatL07(int longitudBarra) {
        char[] rotacion = {'\\', '|', '/', '-'};
        try {
            for (int i = 0; i <= longitudBarra; i++) {
                StringBuilder b = new StringBuilder("[");
                for (int j = 0; j < longitudBarra; j++) {
                    if (j < i) b.append("=");
                    else if (j == i) b.append(rotacion[i % rotacion.length]);
                    else b.append(" ");
                }
                b.append("] ").append((i * 100) / longitudBarra).append("%");
                System.out.print("\r" + b.toString());
                Thread.sleep(80);
            }
            System.out.println("\n¡Finalizado!");
        } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }

    public void eatL08() {
        String texto = "Erick Cuji";
        try {
            for (int i = 1; i <= texto.length(); i++) {
                int pct = (i * 100) / texto.length();
                System.out.print("\r[" + texto.substring(0, i) + "                 ] " + pct + "%");
                Thread.sleep(250);
            }
            System.out.println("\n¡Finalizado!");
        } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }

    public void eatL09() {
        String texto = "Erick Cuji";
        try {
            int n = texto.length();
            System.out.println("Ejemplo de salida:");
            for (int i = 0; i < n; i++) {
                char c = texto.charAt(i);
                int pct = ((i + 1) * 100) / n;
                System.out.println(c + " \t" + pct + "%");
                Thread.sleep(250);
            }
            System.out.println("¡Finalizado!");
        } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }

    public void eatL10(int totalKb) {
        if (totalKb <= 0) totalKb = 76; // Valor por defecto si ingresan 0
        try {
            System.out.println("\nDownloading ArchivoErick-win_amd64.whl (" + totalKb + " kB)");
            for (int current = 0; current <= totalKb; current += 4) {
                if (current > totalKb) current = totalKb;
                int bloques = (current * 25) / totalKb;
                StringBuilder b = new StringBuilder();
                for (int i = 0; i < 25; i++) {
                    b.append(i < bloques ? "━" : " ");
                }
                System.out.print("\r " + b.toString() + " " + String.format("%.1f", (double)current) + " / " + totalKb + " kB");
                Thread.sleep(80);
                if (current == totalKb) break;
            }
            System.out.println("\n¡Descarga completada!");
        } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }

    public void eatL11(int niveles) {
        try {
            System.out.println("\n--- Señales de audio simétricas (" + niveles + " niveles) ---");
            for (int step = 0; step < niveles; step++) {
                int nivel = 1 + random.nextInt(6);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < nivel; i++) sb.append("-");
                System.out.println(sb.toString() + "|" + sb.toString() + " nivel " + nivel);
                Thread.sleep(350);
            }
            
            System.out.println("\n--- Barras De Sonido Vectorial ---");
            String[] nivelesSonido = {
                " ≡ ",
                " ≡ ≡ ≡ ",
                " ≡ ≡ ≡ ≡ ≡ ",
                " ≡ ≡ ≡ ≡ ≡ ≡ ≡ ≡ ≡ ≡ ",
                "≡ ≡ ≡ ≡ ≡ ≡ ≡ ≡ ≡ ≡ ≡ ≡ ≡ ≡ ≡ "
            };
            for (String barra : nivelesSonido) {
                System.out.println(barra);
                Thread.sleep(300);
            }
            System.out.println("¡Finalizado!");
        } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }

    public void eatL12(int maxDesplazamiento) {
        String[] figura = {
            " \\|||/ ",
            " (> <) ",
            "ooO-(_)-Ooo"
        };
        try {
            System.out.println("\n--- Desplazamiento de figura ---");
            for (int esp = 0; esp < maxDesplazamiento; esp++) {
                StringBuilder espacios = new StringBuilder();
                for (int e = 0; e < esp; e++) espacios.append(" ");
                
                System.out.print("\033[H\033[2J");
                System.out.flush();
                
                for (String linea : figura) {
                    System.out.println(espacios.toString() + linea);
                }
                Thread.sleep(150);
            }

            for (int esp = maxDesplazamiento; esp >= 0; esp--) {
                StringBuilder espacios = new StringBuilder();
                for (int e = 0; e < esp; e++) espacios.append(" ");
                
                System.out.print("\033[H\033[2J");
                System.out.flush();
                
                for (String linea : figura) {
                    System.out.println(espacios.toString() + linea);
                }
                Thread.sleep(150);
            }
            System.out.println("¡Finalizado!");
        } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }
}