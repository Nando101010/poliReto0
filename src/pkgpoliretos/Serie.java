package pkgpoliretos;

public class Serie {

    public void g1Sc01SignosAlternados(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print("+ ");
            } else {
                System.out.print("- ");
            }
        }
        System.out.println();
    }

    public void g1Sc02GruposSignosUno(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("+");
            }
            System.out.print(" ");
        }
        System.out.println();
    }

    public void g1Sc03GruposSignosDos(int n) {
        int terminosGenerados = 0;
        int cantidad = 2;
        while (terminosGenerados < n) {
            for (int j = 0; j < cantidad; j++) {
                System.out.print("+");
            }
            System.out.print(" ");
            if (terminosGenerados == 0) {
                cantidad = 3;
            } else {
                cantidad += 2;
            }
            terminosGenerados++;
        }
        System.out.println();
    }

    public void g1Sc04OperadoresCiclicos(int n) {
        char[] ops = { '+', '-', '*', '/' };
        for (int i = 0; i < n; i++) {
            System.out.print(ops[i % 4] + " ");
        }
        System.out.println();
    }

    public void g1Sc05IndicadorDireccional(int n) {
        char[] indicadores = { '\\', '|', '/', '-' };
        int i = 0;
        int contador = 0;
        while (contador < n) {
            System.out.print(indicadores[i] + " ");
            i = (i + 1) % 4;
            contador++;
        }
        System.out.println();
    }

    public void g1Sc06LetrasConsecutivas(int n) {
        char letra = 'a';
        for (int i = 0; i < n; i++) {
            System.out.print((char) (letra + i) + " ");
        }
        System.out.println();
    }

    public void g1Sc07LetraYSigno(int n) {
        char letra = 'a';
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print((char) (letra + i) + " ");
            } else {
                if ((i / 2) % 2 == 0) {
                    System.out.print("+ ");
                } else {
                    System.out.print("- ");
                }
            }
        }
        System.out.println();
    }
}