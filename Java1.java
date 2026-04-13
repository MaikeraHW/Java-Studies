public class Java1 {
    public static void main(String[] args) {
        byte idade = 32;
        short ano = 2026;
        int populacao = 250000;
        long popmund = 65498765464L;
        float decimal = 2.75f;
        double decimalgrande = 654.64654D;
        boolean boleano = false;
        char caracter = 'M';
        // esses valores são primitivos e recebem promoção automática pra proteger de erros em cálculos
        var nomeDaVariavel = 'M'; // Sempre que declarar uma VAR, é necessário inputar um valor
        
        System.out.println(idade);
        System.out.println(ano);
        System.out.println(populacao);
        System.out.println(popmund);
        System.out.println(decimal);
        System.out.println(decimalgrande);
        System.out.println(boleano);
        System.out.println(caracter);
        System.out.println(nomeDaVariavel + caracter);

    }
}