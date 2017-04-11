package calculadora;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    public static void main(String args[])
    {
        Calculadora C = new Calculadora();
        System.out.println(">>>>"+C.calculadora("5/5"));
    }
    public String calculadora(String expressao) {
        String resultado;
        List<Double> listaNumeros = new ArrayList<Double>();
        List<Character> listaOperadores = new ArrayList<Character>();

        listaNumeros = obterNumero(expressao);
        listaOperadores = obterOperadores(expressao);

        resultado = calcularValor(listaNumeros, listaOperadores);

        return resultado;

    }

    private String calcularValor(List<Double> listaNumeros, List<Character> listaOperadores) {
        String resultado = "";
        double total = 0.0;
        int j=0;
        for (int i = 0; i < listaNumeros.size()-1; i++) {

            if ( total == 0.0) {
                double num1 = listaNumeros.get(i).doubleValue();
                double num2 = listaNumeros.get(i + 1).doubleValue();
                char operador = listaOperadores.get(i).charValue();
                total = executar(num1, operador, num2);
            }
            else if (total > 0.0) { 
                double num2 = listaNumeros.get(i).doubleValue();
                char operador = listaOperadores.get(j).charValue();
                total = executar(total, operador, num2);
                j++;
            }
            
        }

        resultado = ""+total;
        return resultado;
    }

    private double executar(double num1, char operador, double num2) {
        double resultado = 0.0;

        if (operador == '+') {
            resultado = num1 + num2;
        } else if (operador == '-') {
            resultado = num1 - num2;
        } else if (operador == '/') {
            resultado = num1 / num2;
        } else if (operador == '*') {
            resultado = num1 * num2;
        }
        return resultado;
    }

    private List<Double> obterNumero(String expressao) {

        List<Double> listaNumeros = new ArrayList<Double>();

        String numeroString = "";
        for (int i = 0; i < expressao.length(); i++) {

            if (isOperador(expressao.charAt(i))) {
                Double numero = Double.valueOf(numeroString);
                listaNumeros.add(numero);
                numeroString = "";
            } else {
                numeroString = numeroString.concat("" + expressao.charAt(i));
            }
        }
        if(!numeroString.isEmpty())
        {
                Double numero = Double.valueOf(numeroString);
                listaNumeros.add(numero);
            
        }
        return listaNumeros;
    }

    private List<Character> obterOperadores(String expressao) {

        List<Character> listaOperadores = new ArrayList<Character>();


        for (int i = 0; i < expressao.length(); i++) {

            if (isOperador(expressao.charAt(i))) {
                listaOperadores.add(new Character(expressao.charAt(i)));
            }
        }

        return listaOperadores;
    }

    private boolean isOperador(char caracter) {
        boolean isOperador = false;
        if (caracter == '-' || caracter == '+' || caracter == '/' || caracter == '*') {
            isOperador = true;
        }
        return isOperador;
    }
} 
