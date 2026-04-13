
import java.util.Scanner;

public class ArrayNotes{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double media = 0;
        double[] notes;
        notes = new double[5];

        System.out.println("Digite a primeira nota do aluno");
        notes[0] = sc.nextDouble();
        System.out.println("Digite a segunda nota do aluno");
        notes[1] = sc.nextDouble();
        System.out.println("Digite a terceira nota do aluno");
        notes[2] = sc.nextDouble();
        System.out.println("Digite a quarta nota do aluno");
        notes[3] = sc.nextDouble();
        System.out.println("Digite a quinta nota do aluno");
        notes[4] = sc.nextDouble();

        System.out.println("As notas do aluno são:");

        for(int j = 0; j < notes.length; j++){
            System.out.println(notes[j]);
        }

        for (int k = 0; k < notes.length; k++){
            media += notes[k];
        }

        System.out.println("E a média do Aluno é: " + (media / notes.length));
    }





}