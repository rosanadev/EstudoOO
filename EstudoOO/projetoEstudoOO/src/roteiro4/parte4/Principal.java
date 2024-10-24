package roteiro4.parte4;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe sua matrícula: ");
        int matricula = entrada.nextInt();
        entrada.nextLine(); 
        
        System.out.println("Informe seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Informe seu curso: ");
        String curso = entrada.nextLine();

        System.out.println("Informe seu ano de ingresso: ");
        int anoIngresso = entrada.nextInt();

        System.out.println("Informe sua quantidade de disciplinas: ");
        int qtdeDisciplinas = entrada.nextInt();

        Aluno aluno01 = new Aluno(matricula, nome, curso, anoIngresso, qtdeDisciplinas);

        System.out.println("Matricula : " + aluno01.getMatricula());
        System.out.println("Nome : " + aluno01.getNome());
        System.out.println("Curso : " + aluno01.getCurso());
        System.out.println("Ano Ingresso : " + aluno01.getAnoIngresso());
        System.out.println("Quantidade de Disciplinas: " + aluno01.getQtdeDisciplinas());
        System.out.println("Situação: " + aluno01.getSituacao());


        entrada.close();
    }

}
