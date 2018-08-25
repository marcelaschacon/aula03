package br.com.db1.aula03;

/*
 * TESTE
 * DE
 * ENVIO
 * https://github.com/jlacerdan/db1start/invitations
 */
/*
 * TESTE
 * DE
 * RECEPTOR
 */

public class Inteiro {

	public Integer Soma(Integer valor1, Integer valor2) {
		return valor1 + valor2;
	}
	
	public Integer Subtracao(Integer valor1, Integer valor2) {
		return valor1 - valor2;
	}
	
	public Integer Multiplicacao(Integer valor1, Integer valor2) {
		return valor1 * valor2;
	}
	
	public Integer Divisao(Integer valor1, Integer valor2) {
		if (valor2 == 0) {
			throw new ArithmeticException();
		}
		return valor1 / valor2;
	}
	
	public Boolean ehPar(Integer parametro) {
		return parametro % 2 == 0;		
	}
	
	public Boolean ehMaior(Integer valor1, Integer valor2){
		return valor1 > valor2;
	}

}
