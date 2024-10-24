package roteiro4.parte3;

public class Principal {

    public static void main(String[] args) {

        Aluno aluno01 = new Aluno(111, "Jose", "SI", 2019);

        Aluno aluno02 = new Aluno(777, "Rosana", "Ciência da computação", 2024);
   
        System.out.println("Matricula : " + aluno01.getMatricula());
        System.out.println("Nome : " + aluno01.getNome());
        System.out.println("Curso : " + aluno01.getCurso());
        System.out.println("Ano Ingresso : " + aluno01.getanoIngresso());

        aluno01.setMatricula(222);

        System.out.println("Matricula : " + aluno01.getMatricula());
        System.out.println("Nome : " + aluno01.getNome());
        System.out.println("Curso : " + aluno01.getCurso());
        System.out.println("Ano Ingresso : " + aluno01.getanoIngresso());


        System.out.println("----------------------------------------------------------");

        System.out.println("Matricula : " + aluno02.getMatricula());
        System.out.println("Nome : " + aluno02.getNome());
        System.out.println("Curso : " + aluno02.getCurso());
        System.out.println("Ano Ingresso : " + aluno02.getanoIngresso());

    }
}
