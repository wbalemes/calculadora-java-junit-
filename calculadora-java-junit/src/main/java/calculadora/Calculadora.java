package calculadora;
import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero");
		int num1 = input.nextInt();
		System.out.println("Entre com o segundo numero");
		int num2 = input.nextInt();
		
		
		
		int soma = calc.somar(num1, num2);
		System.out.println("Resultado é: " + soma);

		
		int sub = calc.subtracao(num1, num2);
		System.out.println("Resultado é: " + sub);

		
		int multi = calc.multiplicar(num1, num2);
		System.out.println("Resultado é: " + multi);

		
		int divi = calc.dividir(num1, num2);
		System.out.println("Resultado é: " + divi);

		
		double pote = calc.potencia(num1, num2);
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