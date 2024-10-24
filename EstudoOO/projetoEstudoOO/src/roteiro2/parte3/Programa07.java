package roteiro2.parte3;

import java.util.Scanner;

public class Programa07 {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
        float somaNotas = 0;
        float qtNotas = 0;

            for (;;) {
                System.out.println("Informe uma nota (para encerrar digite -1):");
                float nota = entrada.nextFloat();

                if (nota == -1) {
                    break;  
                }

                if (nota >= 7) {
                    System.out.println("Aprovado");
                } else {
                    System.out.println("Reprovado");
                }

                somaNotas += nota;
                qtNotas++;
            }
                if (qtNotas > 0) {
                    float media = somaNotas / qtNotas;
                    System.out.printf("A média das notas inseridas é: %.2f%n", media);

            }

        } 
    }
}