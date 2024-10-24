package roteiro3.parte1;

import java.util.Scanner;

public class Programa12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); 
       
        double sb, graImp, sr;
        
        System.out.println("Informe o Salário Base :");
        sb = entrada.nextDouble();
        graImp = Programa12.calcGratImp(sb);
        sr = sb + graImp;

        System.out.println("Salário a receber : " + sr);
        
        entrada.close();
    }

    public static double calcGratImp(double sb)
    {
        return (sb*5/100) - (sb*7/100);
    }

}
