abstract class Operator{
    double num1;
    double num2;

    public abstract double CalcNow(double num1, double num2);

}

class Soma extends Operator {

    @Override
    public double CalcNow(double num1, double num2) {
        return num1 + num2;
    }
    
}

class Subtracao extends Operator {

    @Override
    public double CalcNow(double num1, double num2) {
        return num1 - num2;
    }
}
class Multiplicacao extends Operator {

    @Override
    public double CalcNow(double num1, double num2) {
        return num1 * num2;
    }
}

class Divisao extends Operator {

    @Override
    public double CalcNow(double num1, double num2) {
        return num1 / num2;
    }
}



public class Calculador {
    public static void main(String[] args) {

        Operator sominha = new Soma();
        System.out.println("O valor da soma é: " + sominha.CalcNow(10, 5));

        Operator subtracaozinha = new Subtracao();
        System.out.println("O valor da subtração é: " + subtracaozinha.CalcNow(10, 5));

        Operator multiplicacaozinha = new Multiplicacao();
        System.out.println("O valor da multiplicação é: " + multiplicacaozinha.CalcNow(10, 5));

        Operator divisaozinha = new Divisao();
        System.out.println("O valor da divisão é: " + divisaozinha.CalcNow(10, 5));

        
    }
}
