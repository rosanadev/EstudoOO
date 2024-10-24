package roteiro2.parte4;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {   
    public static void main(String[] args) {
    Random random = new Random();
    int numeroSecreto = random.nextInt(100)+1;

    Scanner entrada = new Scanner(System.in);
    int numero = 0;

    while(numero != numeroSecreto){

    System.out.println("Tente adivinhar um número entre 1 e 100");
    numero = entrada.nextInt();

    if (numero > numeroSecreto){
        System.out.println("O número é maior que o número secreto");
    }
    else if (numero < numeroSecreto){
        System.out.println("O número é menor que o número secreto");
    }
    else {
        System.out.println("Parabéns! Você acertou o número <3");
    }

        }
        entrada.close();
    }
}
