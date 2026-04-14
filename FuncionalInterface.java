public class FuncionalInterface {
    
    public double somar(double a, double b){
        return a + b;
    }

     public double subtrair(double a, double b){
        return a - b;
    }

     public double multiplicar(double a, double b){
        return a * b;
    }

     public double dividir(double a, double b){
        return a / b;
    }


    public static void main(String[] args) {

        FuncionalInterface calculadora = new FuncionalInterface();
        double resultadoSoma = calculadora.somar(10,5);
        
    }
}
