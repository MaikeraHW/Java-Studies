@FunctionalInterface
interface Calculadora {
    double calcular (double a, double b);
}

    public class CalculadoraComInterface{
        public static void main(String[] args) {
            Calculadora soma = (a, b) -> a + b;
            Calculadora subtracao = (a, b) -> a - b;
            Calculadora multipliacao = (a, b) -> a * b;
            Calculadora divisao = (a, b) -> a / b;
        }
    }