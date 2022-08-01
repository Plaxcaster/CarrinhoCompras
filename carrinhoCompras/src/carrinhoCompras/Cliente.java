package carrinhoCompras;

public abstract class Cliente {

	CarrinhoCompras carrinho;
	private String Nome;
    private String numeroConta;
    
	public Cliente(String nome, String numeroConta) {
        Nome = nome;
        this.numeroConta = numeroConta;
    }
    public String getNome() {
        return Nome;
    }
    public String getNumeroConta() {
        return numeroConta;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setCarrinho(CarrinhoCompras carrinho) {
		this.carrinho = carrinho;
	}
    @Override
    public String toString() {
        return "Pessoa [Nome=" + Nome + ", numeroConta=" + numeroConta + "]";
    }
    
}
