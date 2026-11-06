package pkgPoliretos2;

public class figuras {
    // FIGURA 1: Cuadrado 
    public void figura01(int n) {
        System.out.println("\n--- Figura 1: Cuadrado Vacío * ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // --- FIGURA 2: Cuadrado vacío ---
    public void figura02(int n) {
        System.out.println("\n--- Figura 2: Cuadrado Vacío Alternado ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    if ((i + j) % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("+ ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    // --- FIGURA 3: Triángulo rectángulo inferior izquierdo ---
    public void figura03(int n) {
        System.out.println("\n--- Figura 3: Triángulo Inf. Izquierdo ---");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // --- FIGURA 4: Triángulo rectángulo superior izquierdo ---
    public void figura04(int n) {
        System.out.println("\n--- Figura 4: Triángulo Sup. Izquierdo ---");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

   // --- FIGURA 5: Pirámide invertida centrada ---
    public void figura05(int n) {
        System.out.println("\n--- Figura 5: Pirámide Invertida Centrada ---");
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // --- FIGURA 6: Pirámide normal centrada ---
    public void figura06(int n) {
        System.out.println("\n--- Figura 6: Pirámide Centrada ---");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // --- FIGURA 7: Escalera descendente ---
    public void figura07(int n) {
        System.out.println("\n--- Figura 7: Escalera Descendente ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("    "); 
            }
            System.out.println("|_");
        }
    }

    // --- FIGURA 8: Escalera ascendente ---
    public void figura08(int n) {
        System.out.println("\n--- Figura 8: Escalera Ascendente ---");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("    "); 
            }
            System.out.println("_|");
        }
    }

    // --- FIGURA 9: Escalera en pico (Subida y bajada) ---
    public void figura09(int n) {
      System.out.println("\n--- Figura 9: Escalera en Pico ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print("    ");
            }
            
            System.out.print("___|");
            
            for (int j = 0; j < i; j++) {
                System.out.print("        ");
            }
        
            System.out.println("|___");
        }
    }

    // --- FIGURA 10: Escalera con símbolos alternados (*, +, etc.) ---
    public void figura10(int n) {
        System.out.println("\n--- Figura 10: Escalera Alternada ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("    ");
            }
            if (i % 2 == 0) {
                System.out.println("|_+-");
            } else {
                System.out.println("|_-_");
            }
        }
    }

    // --- FIGURA 11: Escalera con guiones progresivos ---
    public void figura11(int n) {
        System.out.println("\n--- Figura 11: Escalera con guiones ---");
        int espaciosAcumulados = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < espaciosAcumulados; j++) {
                System.out.print(" ");
            }
            
            System.out.print("|");
            
            int numGuiones = i + 1;
            for (int k = 0; k < numGuiones; k++) {
                System.out.print("-");
            }

            espaciosAcumulados += 1 + numGuiones;
            
            System.out.println();
        }
    }

    // --- FIGURA 12: Triángulo numérico decreciente ---
    public void figura12(int n) {
        System.out.println("\n--- Figura 12: Triángulo Numérico Decreciente ---");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // --- FIGURA 13: Triángulo numérico creciente ---
    public void figura13(int n) {
        System.out.println("\n--- Figura 13: Triángulo Numérico Creciente ---");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // --- FIGURA 14: Triángulo de Pascal centrado ---
    public void figura14(int n) {
        System.out.println("\n--- Figura 14: Triángulo de Pascal ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            int val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    // --- FIGURA 15: Triángulo de Pascal alineado a la izquierda ---
    public void figura15(int n) {
        System.out.println("\n--- Figura 15: Triángulo de Pascal Izquierda ---");
        for (int i = 0; i < n; i++) {
            int val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val + "\t");
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    // --- FIGURA 16: Cruz en equis con signos alternados (+ y -) ---
    public void figura16(int n) {
        System.out.println("\n--- Figura 16: Cruz con símbolos intercalados (+ y -) ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    if (i % 2 == 0) {
                        System.out.print("+ ");
                    } else {
                        System.out.print("- ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // --- FIGURA 17: Patrón en X con números (1 y 0) ---
    public void figura17(int n) {
       System.out.println("\n--- Figura 17: Cruz Numérica Intercalada (1 y 0) ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    if (j % 2 == 0) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // --- FIGURA 18: Triángulo con patrón numérico de suma (similar a Pascal modificado) ---
    public void figura18(int n) {
        System.out.println("\n--- Figura 18: Triángulo de Sumas Personalizado ---");
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    matriz[i][j] = (i == 0) ? 2 : 1; 
                    if (i > 0 && j == i) matriz[i][j] = 2; 
                } else {
                    matriz[i][j] = matriz[i - 1][j - 1] + matriz[i - 1][j];
                }
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // --- FIGURA 19: Triángulo mixto con asteriscos, sumas y símbolos ---
    public void figura19(int n) {
       System.out.println("\n--- Figura 19: Triángulo Mixto sin ceros ---");
        int[][] m = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    System.out.print((i == 0 ? "*" : "+") + "\t");
                } else if (j == i) {
                    System.out.print("*\t");
                } else {
                    if (i > 1 && j > 0) {
                        m[i][j] = (i * j) + (i - j); 
                    } else {
                        m[i][j] = i + j;
                    }
                    System.out.print(m[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    public void imprimirTodas(int n) {
        System.out.println("\n========================================");
        System.out.println("   IMPRIMIENDO LAS 19 FIGURAS (n = " + n + ")");
        System.out.println("========================================");
        
        figura01(n);
        figura02(n);
        figura03(n);
        figura04(n);
        figura05(n);
        figura06(n);
        figura07(n);
        figura08(n);
        figura09(n);
        figura10(n);
        figura11(n);
        figura12(n);
        figura13(n);
        figura14(n);
        figura15(n);
        figura16(n);
        figura17(n);
        figura18(n);
        figura19(n);
    }
}
