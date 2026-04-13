import java.util.Scanner;

public class SistemaEscolar {

    public static void main(String[] args) {
        String name = "";
        double noteA;
        double noteB;
        double noteC;
        double media = -1;
        int option;

    Scanner sc = new Scanner(System.in);

        do {
            
            System.out.println("Programa escolar do Maikera");
            System.out.println("O que deseja fazer?");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Lançar Notas");
            System.out.println("3. Calcular Média");
            System.out.println("4. Sair");
            option = sc.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("Qual é o nome do aluno?");
                    sc.nextLine();
                    name = sc.nextLine();
                }
                case 2 -> {
                    System.out.println("Digite sua primeira nota: ");
                    noteA = sc.nextDouble();
                    System.out.println("Digite sua segunda nota: ");
                    noteB = sc.nextDouble();
                    System.out.println("Digite sua terceira nota: ");
                    noteC = sc.nextDouble();
                    media = (noteA + noteB + noteC) / 3;
                }
                case 3 -> {
                    if( name == null || name.isEmpty() || media == -1 ) {
                        System.out.println("Dados incompletos, favor corrigir!");
                    } else {
                    System.out.println("A media do aluno " + name + " É: " + media);
                }
            }
            }
        } while (option != 4);
            
        System.out.println("Obrigado por usar nosso sistema");

    }
    
}
