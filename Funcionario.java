public class Funcionario {
    String nome;
    String cargo;
    int idade;
    
    public static void main(String[] args) {
        Funcionario maiconH = new Funcionario();
        maiconH.nome = "Maicon Henrique Wagner";
        maiconH.cargo = "Developer";
        maiconH.idade = 32;
        

        System.out.println(maiconH.nome);
        System.out.println(maiconH.cargo);
        System.out.println(maiconH.idade);
    }
}
