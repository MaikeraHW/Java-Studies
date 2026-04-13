interface Animal {
    void fazerSom(); //Cria o método que a classe vai precisar conter
    void Alimentarse();
}

    class Cachorro implements Animal{
        public void fazerSom() {
            System.out.println("O cachorro late");
    }

    public void Alimentarse() {
            System.out.println("O cachorro se alimenta de carne");
        } 
}

    class Gato implements Animal {
        public void fazerSom() {
            System.out.println("O gato mia");
    }

    public void Alimentarse() {
            System.out.println("O gato se alimenta de passarinho");
        } 
    }

    public class Classinterface {
        public static void main (String[] args){

        Cachorro cachorro = new Cachorro();
            cachorro.fazerSom();
            cachorro.Alimentarse();

        Gato gato = new Gato();
            gato.fazerSom();

        }
    }