package br.com.db1.aula03;

public class Matematica {
	
	public boolean menorValor(double valor1, double valor2) {
		return valor1 < valor2;
	}
	
	public double menorValor3Numeros(double valor1, double valor2, double valor3) {
		double menor;
		if (valor1<valor2 && valor1<valor3) {
			menor = valor1;
		} else if (valor2 < valor1 && valor2 < valor3) {
			menor = valor2;
		} else {
			menor = valor3;
		}
		return menor;
	}
	
	public double mediaAritmetica(double valor1, double valor2, double valor3) {
		return (valor1+valor2+valor3)/3;
	}
	
	public double areaTriangulo(double base, double altura) {
		return (base*altura)/2;
	}

}
