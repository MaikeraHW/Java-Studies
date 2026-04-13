public class Construtor {
    String nome;
    String cargo;
    int idade;

    public Construtor(String nomeInit, String cargoInit, int idadeInit) {
        this.nome = nomeInit;
        this.cargo = cargoInit;
        this.idade = idadeInit;
    }

    
    public static void main(String[] args) {
        Construtor funcionario = new Construtor("Maicon Henrique Wagner", "Developer", 32);
        

        System.out.println(funcionario.nome);
        System.out.println(funcionario.cargo);
        System.out.println(funcionario.idade);
    }

}