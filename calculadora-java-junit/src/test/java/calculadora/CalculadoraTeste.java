package calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraTeste {

	int num1 = 2;
	int num2 = 2;	
	int resultado = 0;
/*	@Test
	void testMain() {
		fail("Not yet implemented");
	}
*/
	@Test
	public void testSomar() {
		Calculadora calc = new Calculadora();
		resultado = calc.somar(num1, num2);
		assertEquals(4, resultado);
	}

	@Test
	public void testSubtracao() {
		Calculadora calc = new Calculadora();
		resultado = calc.subtracao(num1, num2);
		assertEquals(0, resultado);
	}

	@Test
	public void testMultiplicar() {
		Calculadora calc = new Calculadora();
		resultado = calc.multiplicar(num1, num2);
		assertEquals(4, resultado);
	}

	@Test
	public void testDividir() {
		Calculadora calc = new Calculadora();
		resultado = calc.dividir(num1, num2);
		assertEquals(1, resultado);
	}

	@Test
	public void testPotencia() {
		Calculadora calc = new Calculadora();
		double resultado = calc.potencia(num1, num2);
		assertEquals(4, resultado);
	}

}
