package carrinhoCompras;

import carrinhoCompras.TipoProduto.TipoProd;

public class Item {

    protected String Produto;
    public TipoProd tipoProduto;
    protected int Quantidade;
    double PrecoUnitario;
    double TotalPorItem;
    double TotalDesconto;


    public Item(String produto, TipoProd hortifruti, int quantidade, double precoUnitario) {
        this.Produto = produto;
        this.tipoProduto = hortifruti;
        this.Quantidade = quantidade;
        this.PrecoUnitario = precoUnitario;
        this.TotalPorItem = Quantidade*PrecoUnitario;
        this.TotalDesconto = Quantidade*hortifruti.getDesconto();
    }

    //tostring
	@Override
	public String toString() {
		return "Item [Produto=" + Produto +
				", Quantidade=" + Quantidade +
				", Preço Unitário =" + PrecoUnitario +
				", Total por Item=" + TotalPorItem + "]";
	}

	
	//Getters e Setters
	public String getProduto() {
		return Produto;
	}

	public void setProduto(String produto) {
		Produto = produto;
	}

	public TipoProd getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(TipoProd tipoProduto) {
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
