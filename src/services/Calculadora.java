package services;

public class Calculadora {

	private String modelo;
	private String marca;

	public Calculadora(String modelo, String marca) {

		this.modelo = modelo;
		this.marca = marca;
	}

	public Double somar(Double a, Double b) {

		return a + b;
	}

	public Double subtrair(Double a, Double b) {

		return a - b;
	}
	
	public Double multiplicar(Double a, Double b) {

		return a * b;
	}
	
	public Double dividir(Double a, Double b) {

		return a / b;
	}
	
	public Double calcularRaizQuadrada(Double x) {
		
		return Math.sqrt(x);
	}
	
	public Double calcularPotencia(Double a, Double b) {
		
		return Math.pow(a, b);
	}
}
