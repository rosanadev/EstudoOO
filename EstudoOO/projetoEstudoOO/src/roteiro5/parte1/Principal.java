package roteiro5.parte1;

public class Principal {
public static void main(String[] args) {
        
      Loja loja01 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");
      Loja loja02 = new Loja("Mercadão do Povo", "", "10101010");


    System.out.println("Nome Fantasia: " + loja01.getnomeFantasia());
    System.out.println("Razão Social: " + loja01.getrazaoSocial());
    System.out.println("CNPJ: " + loja01.getcnpj());
    System.out.println("Valor de Faturamento: " + loja01.getvalorFat());
    System.out.println("Área: " + loja01.getarea());
    System.out.println("Nome do Proprietário: " + loja01.getnomeProprietario());

    System.out.println("Nome Fantasia: " + loja02.getnomeFantasia());
    System.out.println("Razão Social: " + loja02.getrazaoSocial());
    System.out.println("CNPJ: " + loja02.getcnpj());
    System.out.println("Valor de Faturamento: " + loja02.getvalorFat());
    System.out.println("Área: " + loja02.getarea());
    System.out.println("Nome do Proprietário: " + loja02.getnomeProprietario());
        
    }

}
