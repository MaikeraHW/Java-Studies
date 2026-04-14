abstract  class Animal { //Superclasse

    public abstract void fazerSom();
    
}


class Cachorro extends Animal { //SubClasse
    public void fazerSom() {
        System.out.println("O Cachorro faz Au au!");
    }
    
}

class Gato extends Animal { //Subclasse
    public void fazerSom(){
        System.out.println("O gato faz miau miau!");
    }

}

public class Polimorfism {
    public static void main(String[] args) {
        
        Animal myDog = new Cachorro();
            myDog.fazerSom();
        Animal myCat = new Gato();
            myCat.fazerSom();
    }
}