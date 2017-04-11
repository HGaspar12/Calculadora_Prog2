package calculadora;

public class CalculadoraSimples {
     double num1, num2;
    double total;

    /**
     *
     * @return
     */
    public double somar(){
        total = num1 + num2;
        return total;
    }

    public double subtrair(){
        total = num1 - num2;
        return total;
    }

    public double dividir(){
        total = num1 / num2;
        return total;
    }
    public double multipli(){
        total = num1 * num2;
        return total;
    }
}
