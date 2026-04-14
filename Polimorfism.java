abstract  class Animal { //Superclasse
    String name;

    public Animal(String nameInt){
        this.name = nameInt;
    }

    public abstract void fazerSom();

    public abstract void caminhar();
    
}


class Cachorro extends Animal { //SubClasse
    String tipoLatido;

    public Cachorro(String name, String tipoLatidoInt){
        super(name);
        this.tipoLatido = tipoLatidoInt;
    }

    public void fazerSom() {
        System.out.println("O " + name + " está latindo " + tipoLatido);
    }

    public void caminhar(){
        System.out.println("O " + name + " está caminhando");
    }
    
}

public class Polimorfism {
    public static void main(String[] args) {
        
        Animal myDog = new Cachorro("Rex", "Grave");
            myDog.fazerSom();
            myDog.caminhar();
    }
}

//Polimorfismo: Declara com a classe pai porém cria a instância na classe filha