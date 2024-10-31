package roteiro5.parte1;

public class Loja {

    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double valorFat;
    private double area;
    private String nomeProprietario;
 
    public Loja(String nomeFantasia, String razaoSocial, String cnpj){
        this.nomeFantasia = nomeFantasia;
        if (razaoSocial.equals("")){
            this.razaoSocial = nomeFantasia;
        }
        else {
            this.razaoSocial = razaoSocial;
        }

        this.cnpj = cnpj;
    }

    public String getnomeFantasia() {
        return nomeFantasia;
    }

    public void setnomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getrazaoSocial() {
        return razaoSocial;
    }

    public void setrazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getcnpj() {
        return cnpj;
    }

    public void setcnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getvalorFat() {
        return valorFat;
    }

    public void setvalorFat(double valorFat) {
        this.valorFat = valorFat;
    }

    public double getarea() {
        return area;
    }

    public void setarea(double area) {
        this.area = area;
    }

    public String getnomeProprietario() {
        return nomeProprietario;
    }

    public void setnomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

 
}
