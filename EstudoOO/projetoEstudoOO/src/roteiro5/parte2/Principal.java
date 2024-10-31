package roteiro5.parte2;

public class Principal {
        public static void main(String[] args) {
                
            Loja loja01 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");
            Loja loja02 = new Loja("Mercadão do Povo", "10101010");
            Loja loja03 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");

            loja01.setValorFat(10000);
            loja02.setValorFat(20000);
            loja03.setValorFat(10000);

            System.out.println(" ****** Teste 1 ********");
            if ( loja01.getNomeFantasia() == loja03.getNomeFantasia() ){
                System.out.println("Lojas Iguais");
            }
            else {
                System.out.println("Lojas Diferentes");
            }
      

        
        
        
                
            }
        
        }
        


