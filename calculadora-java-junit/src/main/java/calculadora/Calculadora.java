package calculadora;
import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		Scanner input = new Scanner(System.in);
		System.out.println();
		int soma;
		soma = calc.somar(10, 10);
		System.out.println("Resultado é: " + soma);

		int sub;
		sub = calc.subtracao(10, 5);
		System.out.println("Resultado é: " + sub);

		int multi;
		multi = calc.multiplicar(10, 7);
		System.out.println("Resultado é: " + multi);

		int divi;
		divi = calc.dividir(10, 2);
		System.out.println("Resultado é: " + divi);

		double pote;
		pote = calc.potencia(10, 2);
		System.out.println("Resultado é: " + pote);
		input.close();
	}

	int somar(int a, int b) {
		return a + b;
	}

	int subtracao(int a, int b) {

		return a - b;
	}

	int multiplicar(int a, int b) {
		return a * b;
	}

	int dividir(int a, int b) {
		return a / b;
	}

	double potencia(int a, int b) {
		return Math.pow(a, b);
	}

}