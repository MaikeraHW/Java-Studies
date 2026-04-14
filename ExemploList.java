import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {
        
        List<String> lista = new ArrayList<>();

        lista.add("Maicon");
        lista.add("Morgana");
        lista.add("Julia");
        lista.add("Draco");

        List<String> outralista = Arrays.asList("Iara", "Claudio");
        lista.addAll(outralista);

        String phrase;

        if (lista.contains("Julia") == true){
            phrase = "Yes, it contains";
        } else {
            phrase = "No, do not contains";
        }

        System.out.println(phrase);
        System.out.println(lista);

        lista.remove("teste");
        lista.get(4);  //pega o index da lista
        lista.clear(); //limpa a lista
    }
    
}
