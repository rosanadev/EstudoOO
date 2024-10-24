package roteiro2.parte4;

import java.util.Scanner;

public class Programa09 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int[] vetorNotas = new int[5];
        
        for (int cont = 0; cont < 5; cont++){
            System.out.println("Informe uma nota ");
            int nota = entrada.nextInt();

            if (nota >= 0 && nota <= 10){
                vetorNotas[cont] = nota;
            } 
            else {
                System.out.println("Nota inválida. Digite uma nota entre 0 e 10");
                cont--;
            }
        }

        System.out.println("Notas armazenadas:");
        for (int i=0; i<vetorNotas.length; i++) {
            System.out.println("Nota" + (i+1) + ":" + vetorNotas[i]);

        }
        
        entrada.close();
    }
}

