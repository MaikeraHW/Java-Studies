public class ImprimirProduto {
    
    public static void main(String[] args) {
        Produto produto01 = new Produto("Sapato", 250.0, 18);
        Produto produto02 = new Produto("Sandália", 315, 23);
        Produto produto03 = new Produto("Chinelo", 75.15, 8);

        System.out.println(produto01.imprimiEstoque());
        System.out.println(produto02.imprimiEstoque());
        System.out.println(produto03.imprimiEstoque());
    }
    
}
