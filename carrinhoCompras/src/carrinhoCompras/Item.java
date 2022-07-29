package carrinhoCompras;

public class Item {

    protected String Produto;
    private TipoProduto tipoProduto;
    protected int Quantidade;
    double PrecoUnitario;
    double TotalPorItem;


    public Item(String produto, TipoProduto tipoProduto, int quantidade, double precoUnitario) {
        this.Produto = produto;
        this.tipoProduto = tipoProduto;
        this.Quantidade = quantidade;
        this.PrecoUnitario = precoUnitario;
        this.TotalPorItem = Quantidade*PrecoUnitario;
    }

    //tostring
	@Override
	public String toString() {
		return "Item [PrecoUnitario=" + PrecoUnitario + ", Produto=" + Produto + ", Quantidade=" + Quantidade
				+ ", TotalPorItem=" + TotalPorItem + "]";
	}

	
	//Getters e Setters
	public String getProduto() {
		return Produto;
	}

	public void setProduto(String produto) {
		Produto = produto;
	}

	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public int getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}

	public double getPrecoUnitario() {
		return PrecoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		PrecoUnitario = precoUnitario;
	}

	public double getTotalPorItem() {
		return TotalPorItem;
	}

	public void setTotalPorItem(double totalPorItem) {
		TotalPorItem = totalPorItem;
	}

	
	

}
