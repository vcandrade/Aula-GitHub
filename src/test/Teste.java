package test;

import services.Calculadora;

public class Teste {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora("Casio", "FX-82ESPLUS");
		System.out.println("Soma: " + calc.somar(10.0, 5.0));
		System.out.println("Subtra��o : " + calc.subtrair(10.0, 5.0));
		System.out.println("Multiplica��o : " + calc.multiplicar(10.0, 5.0));
		System.out.println("Divis�o : " + calc.dividir(10.0, 5.0));
		System.out.println("Raiz Quadrada : " + calc.calcularRaizQuadrada(9.0));
	}
}
