package empresa.dados;

public class Trabalhador {
    String nome;
    double salario; // classes podem ser public, private, protected and default
    
    public Trabalhador(String nomeInit, double salarioInit){
        this.nome = nomeInit;
        this.salario = salarioInit;

        System.out.println(nome);
        System.out.println(salario);
}
}