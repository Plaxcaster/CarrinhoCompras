package carrinhoCompras;

public class TipoProduto{ 

	public enum TipoProd {
		Bebidas(0),
		Carnes(0),
		Higiene(0),
		Hortifruti(0.20),
		Limpeza(0),
		Mercearia(0),
		Padaria(0);

		final double desconto;

		TipoProd(double desconto){
			this.desconto = desconto;
		}

		public double getDesconto() {
			return desconto;
		}

		
	}

    public int getDesconto() {
        return 0;
    }
}