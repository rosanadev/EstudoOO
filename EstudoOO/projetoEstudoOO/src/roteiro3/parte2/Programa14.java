package roteiro3.parte2;

import java.util.Scanner;

public class Programa14 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o valor de x ");
        double x = entrada.nextDouble();
        System.out.println("Informe a operação (+, -, *, /) ");
        String op = entrada.next();
        System.out.println("Informe o valor de y ");
        double y = entrada.nextDouble();

        switch (op) {
            case "+" : double soma1 = soma(x,y);
                System.out.println("Resultado : " + soma1);
                break;
            case "-" : double sub1 = subtracao(x,y);
                System.out.println("Resultado : " + sub1);
                break;
            case "*" : double mult1 = multiplicacao(x, y);
                System.out.println("Resultado : " + mult1);
                break;
            case "/" : double div1 = divisao(x, y);
                System.out.println("Resultado : " + div1);
                break;
            default:
                System.out.println("Operacao invalida");
        }
        
        entrada.close();
    }
    
    public static double soma(double x, double y) 
    {
        return (x + y);
    }    
    
    public static double subtracao(double x, double y) 
    {
        return (x - y);
    }
   
    public static double multiplicacao(double x, double y) 
    {
        return (x * y);
    }

    public static double divisao(double x, double y) 
    {
        return (x / y);
    }
}
