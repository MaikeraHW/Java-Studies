import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();

        conjunto.add("Maicon");
        conjunto.add("Morgana");
        conjunto.add("Julia");
        conjunto.add("Draco");


       System.out.println(conjunto);
    }
} //Não garante a ordem dos itens e não aceita elementos duplicados