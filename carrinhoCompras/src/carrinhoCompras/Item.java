package carrinhoCompras;

public class Item {

    protected String Produto;
    protected int Quantidade;
    double PrecoUnitario;
    double TotalPorItem;

    public Item(String produto, int quantidade, double precoUnitario) {
        this.Produto = produto;
        this.Quantidade = quantidade;
        this.PrecoUnitario = precoUnitario;
        this.TotalPorItem = Quantidade*PrecoUnitario;
    }

	@Override
	public String toString() {
		return "Item [PrecoUnitario=" + PrecoUnitario + ", Produto=" + Produto + ", Quantidade=" + Quantidade
				+ ", TotalPorItem=" + TotalPorItem + "]";
	}

	

}
