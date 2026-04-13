package empresa.dados;
public class Metodos {
    /*/
        //Um método é composto de 4 partes
            // Modificador de acesso (public, protected, privated default)
            // O Tipo de retorno (String nesse caso)
            // O Nome do Método (aulaDeMetodos)
            // Paramentros (Entre parenteses quando tiver)
        return "Nome";
    }*/

    private String nome;
    private double salario;

    public Metodos(String nomeInit, double salarioInit){
        this.nome = nomeInit;
        this.salario = salarioInit;
    }
    
    public String retornoDoMetodo(){
        return "Nome: " + nome + ", Salário: " + salario;
    }
    }
