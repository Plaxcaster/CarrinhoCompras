package carrinhoCompras;

public class PessoaJuridica extends Cliente{

    private String Cnpj;

    public PessoaJuridica(String nome, String numeroConta, String Cnpj) {
        super(nome, numeroConta);
        this.Cnpj = Cnpj;
        //TODO Auto-generated constructor stub
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String cnpj) {
        this.Cnpj = cnpj;
    }
    

}
