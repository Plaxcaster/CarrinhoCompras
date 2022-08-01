package carrinhoCompras;

public enum TipoProduto {
	Bebidas(0),
	Carnes(0),
	Higiene(0),
	Hortifruti(0.20),
	Limpeza(0),
	Mercearia(0),
	Padaria(0);

	final double desconto;

	TipoProduto(double desconto){
		this.desconto = desconto;
	}

	public double getDesconto() {
		return desconto;
	}

	
}
