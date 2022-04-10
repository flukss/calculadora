public class Calculadora {
    double resultado;

    public double soma(double valor1, double valor2) {
        resultado = valor1 + valor2;
        return resultado;
    }

    public double subtracao(double valor1, double valor2) {
        resultado = valor1 - valor2;
        return resultado;
    }

    public double divisao(double valor1, double valor2) {
        resultado = valor1 / valor2;
        return resultado;
    }

    public double multiplicacao(double valor1, double valor2) {
        resultado = valor1 * valor2;
        return resultado;
    }

    public double exponeciacao(double valor1) {
        resultado = Math.pow(valor1, 2); // Math é uma classe do Java com funções matemáticas e pow é um método dela para fazer exponenciação
        return resultado;
    }

    public double raizQuadrada(double valor1) {
        resultado = Math.sqrt(valor1); // sqrt
        if (Math.sqrt(valor1) < 0) {
            existeRaiz(resultado);
        }
        return resultado;
    }

    public double baskara(double a, double b, double c) {
        double delta = (b * b) - (4 * a * c);
        double raizDeDelta = Math.sqrt(delta);
        if (delta > 0) {
            double x1 = -b + (raizDeDelta / (2 * a));
            double x2 = -b - (raizDeDelta / (2 * a));
            resultado = x1 + x2;
        } else {
            existeRaiz(resultado);
        }
        return resultado;
    }
    // Método criado para verificar se existe raiz negativa. Eu queria um retorno que não fosse NaN e criei esse método para isso.
    public boolean existeRaiz(double resultado) {
        if (resultado == 0) {
            return false;
        }
        return true;
    }
}
