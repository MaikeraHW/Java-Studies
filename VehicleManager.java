abstract class Vehicle{
    private String placa;
    private int ano;

    public Vehicle (String placaInt, int anoInt){
        this.placa = placaInt;
        this.ano = anoInt;
    }

    public void ExibirInformacoes(){
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
    };
}

    class Onibus extends Vehicle {
        private int assentos;

    public Onibus (String placa, int ano, int assentosInt){
        super(placa, ano);
        this.assentos = assentosInt;
    }

    @Override
    public void ExibirInformacoes() {
       System.out.println("O onibus em questão tem " + assentos + " assentos.");
    }
}


    class Caminhao extends Vehicle {
        int eixos;

        public Caminhao (String placa, int ano, int eixosInt){
            super(placa, ano);
            this.eixos = eixosInt;
        }

    @Override
    public void ExibirInformacoes() {
       System.out.println("O caminhão em questão tem " + eixos + " eixos.");
    }
}


public class VehicleManager {

    public static void main(String[] args) {
        

    Vehicle catarinense = new Onibus("JJA9E10", 2015, 45);
    Vehicle scania = new Caminhao("JJA9E20", 2025, 3);

    catarinense.ExibirInformacoes();
    scania.ExibirInformacoes();

}
    
}
