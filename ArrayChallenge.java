public class ArrayChallenge {
    
    public static void main(String[] args) {

        int soma = 0;
        int numbers[];
        numbers = new int[1000];
        int j = 1;

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = j;
            soma += j;
            j++;
         }
         System.out.println(soma);
}
}