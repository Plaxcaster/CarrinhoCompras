import carrinhoCompras.AddItem;
import carrinhoCompras.AlteraQtdItem;
import carrinhoCompras.CarrinhoCompras;
import carrinhoCompras.Catalogo;
import carrinhoCompras.ChamaCarrinhoDao;
import carrinhoCompras.ChamaClienteDao;
import carrinhoCompras.FretePct;
import carrinhoCompras.ImprimeCarrinho;
import carrinhoCompras.Ordenar;
import carrinhoCompras.PessoaFisica;
import carrinhoCompras.PessoaJuridica;
import carrinhoCompras.RemoveItem;
import carrinhoCompras.TaxaExtra;
import carrinhoCompras.TipoOrdenacao;
import carrinhoCompras.TipoProduto;
import carrinhoCompras.TotalCarrinho;
import carrinhoCompras.TipoProduto.TipoProd;
import dao.CarrinhoDao;
import dao.ClienteDao;

public class Main {

    public static void main(String[] args) {

        ChamaCarrinhoDao inventario = new ChamaCarrinhoDao(new CarrinhoDao<CarrinhoCompras>());

        ChamaClienteDao clientes = new ChamaClienteDao(new ClienteDao());

        PessoaFisica pf = new PessoaFisica("João", "123456789", "00000000000");
        PessoaJuridica pj = new PessoaJuridica("Minha Empresa", "012345555", "11111111111111");

    	Catalogo catalogo = new Catalogo(); //Inicializa os itens que podem ser adicionados no carrinho
        CarrinhoCompras carrinho = new CarrinhoCompras();
        
        carrinho.cliente = pf;

        AddItem.adicionaItem(carrinho, catalogo.getItem(1));
        AddItem.adicionaItem(carrinho, catalogo.getItem(2));
        AddItem.adicionaItem(carrinho, catalogo.getItem(3));
        AddItem.adicionaItem(carrinho, catalogo.getItem(4));
        AddItem.adicionaItem(carrinho, catalogo.getItem(5));

        
        System.out.println();
        System.out.println("Carrinho pos-adicao:");
        ImprimeCarrinho.listaCarrinho(carrinho);
        TotalCarrinho.calcularTotal(carrinho);
        
        System.out.println();
        System.out.println("Carrinho pos-ordenacao:");
        Ordenar.ordenaCarrinho(carrinho, TipoOrdenacao.QUANTIDADE);
        ImprimeCarrinho.listaCarrinho(carrinho);
        TotalCarrinho.calcularTotal(carrinho);
        
        RemoveItem.removeItem(carrinho, catalogo.getItem(1));
        
        System.out.println();
        System.out.println("Carrinho pos-exclusao:");
        ImprimeCarrinho.listaCarrinho(carrinho);
        TotalCarrinho.calcularTotal(carrinho);

        System.out.println();
        System.out.println("Item removido:");
        AlteraQtdItem.alterarQtdItem(carrinho, carrinho.carrinho.get(1), 2,"Remover");
        ImprimeCarrinho.listaCarrinho(carrinho);

        System.out.println();
        System.out.println("Item adicionado:");
        AlteraQtdItem.alterarQtdItem(carrinho, carrinho.carrinho.get(1), 20,"Adicionar");
        ImprimeCarrinho.listaCarrinho(carrinho);

        System.out.println();
        System.out.println("Taxa extra no item hortifruti:");
        TipoProduto.TipoProd hortifruti = TipoProd.Hortifruti;
        TaxaExtra.taxaExtra(carrinho, hortifruti, 0.15);
        ImprimeCarrinho.listaCarrinho(carrinho);

        System.out.println();
        TipoProduto.TipoProd carne = TipoProd.Carnes;
        FretePct.freteItem(carrinho, carne, 0.50);
        ImprimeCarrinho.listaCarrinho(carrinho);

        clientes.incluirVeiculo(pf);
        clientes.incluirVeiculo(pj);
        inventario.incluirVeiculo(carrinho);
        System.out.println(carrinho);

    }
    
}

