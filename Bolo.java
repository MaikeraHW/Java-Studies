public class Bolo {
    int quantidadeDeAcucar;
    String nomeDoBolo;

    public static void main(String[] args) {
        Bolo boloDeChocolate = new Bolo();
        boloDeChocolate.nomeDoBolo = "Bolo de Chocolate";
        boloDeChocolate.quantidadeDeAcucar = 200;

        Bolo boloDeBaunilha = new Bolo();
        boloDeBaunilha.nomeDoBolo = "Bolo de Baunilha";
        boloDeBaunilha.quantidadeDeAcucar = 150;


        System.out.println("Quantida de Açucar em cada tipo de bolo:");
        System.out.println(boloDeChocolate.nomeDoBolo + ": " + boloDeChocolate.quantidadeDeAcucar +"g");
        System.out.println(boloDeBaunilha.nomeDoBolo + ": " + boloDeBaunilha.quantidadeDeAcucar +"g");
    }
}
