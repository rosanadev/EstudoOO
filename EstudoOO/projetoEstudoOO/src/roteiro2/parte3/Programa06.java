package roteiro2.parte3;

import java.util.Scanner;

public class Programa06 {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {

            for (;;) {
                System.out.println("Informe uma nota (para encerrar digite -1):");
                int nota = entrada.nextInt();

                if (nota == -1) {
                    break;  
                }

                if (nota >= 7) {
                    System.out.println("Aprovado");
                } else {
                    System.out.println("Reprovado");
                }
            }

        } 
    }
}

