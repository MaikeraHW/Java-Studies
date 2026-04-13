import empresa.dados.Trabalhador; // se no local da classe desejada, colocar *, ele importa todas as classes da pasta

public class ImprimeTrabalhador {
    public static void main(String[] args) {
        Trabalhador trabalhador = new Trabalhador("Maicon", 4200.00);
        System.out.println(trabalhador);
    }
}