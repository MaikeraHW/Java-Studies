public class Produto {
    private String nome;
    private double preco;
    private long quantidade;

    public Produto(String nomeInit, double precoInit, long quantidadeInit ){
        this.nome = nomeInit;
        this.preco = precoInit;
        this.quantidade = quantidadeInit;

    }

    public String imprimiEstoque(){
        return "Produto: " + nome + " , Estoque: " + quantidade + " , Valor: R$" + preco;
    } 
    
}