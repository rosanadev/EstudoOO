package roteiro4.parte2;

public class Principal {

    public static void main(String[] args) {

        Aluno aluno01 = new Aluno(111, "Jose", "SI", 2019);

        Aluno aluno02 = new Aluno(777, "Rosana", "Ciência da computação", 2024);
   
        System.out.println("Matricula : " + aluno01.matricula);
        System.out.println("Nome : " + aluno01.nome);
        System.out.println("Curso : " + aluno01.curso);
        System.out.println("Ano Ingresso : " + aluno01.anoIngresso);

        System.out.println("----------------------------------------------------------");

        System.out.println("Matricula : " + aluno02.matricula);
        System.out.println("Nome : " + aluno02.nome);
        System.out.println("Curso : " + aluno02.curso);
        System.out.println("Ano Ingresso : " + aluno02.anoIngresso);
    }
    
}
