
import java.util.Scanner;


public class CalculadoraDeMedia {
    
    public static void main(String[] args) {
        double noteA;
        double noteB;
        double noteC;
        String studentName;
        double media;
        String phrase;
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Digite o seu nome: ");
        studentName = sc.nextLine();
        System.out.println("");
        System.out.println("Digite sua primeira nota: ");
        noteA = sc.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        noteB = sc.nextDouble();
        System.out.println("Digite sua terceira nota: ");
        noteC = sc.nextDouble();
        media = (noteA + noteB + noteC) / 3;

        if (media >= 9){
            phrase = "foi aprovado com Louvores";
        } else if (media >= 6) {
            phrase = " foi na estica";
        } else {
            phrase = "reprovou, precisa estudar mais";
        }

        System.out.println(studentName + " a sua média é : " + media + ". Você " + phrase);

    }
}