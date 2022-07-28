package carrinhoCompras;

public class PessoaFisica extends Cliente{

    private String Cpf;

    public PessoaFisica(String nome, String numeroConta, String Cpf) {
        super(nome, numeroConta);
        this.Cpf = Cpf;
        //TODO Auto-generated constructor stub
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }
    

}
