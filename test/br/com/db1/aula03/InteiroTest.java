package br.com.db1.aula03;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.db1.aula03.Inteiro;

public class InteiroTest {

	@Test
	public void somaTest() {
		Inteiro inteiro = new Inteiro();
		Integer somaEsperada = 3;
		assertEquals(somaEsperada, inteiro.Soma(1, 2));
	}
	
	@Test
	public void subtracaoTest() {
		Inteiro inteiro = new Inteiro();
		Integer subEsperada = 2;
		assertEquals(subEsperada, inteiro.Subtracao(5, 3));
		
	}
	
	@Test
	public void multiplicacaoTest() {
		Inteiro inteiro = new Inteiro();		
		Integer multEsperada = 6;
		assertEquals(multEsperada, inteiro.Multiplicacao(2, 3));
	}
	
	@Test
	public void divisaoTest() {
		Inteiro inteiro = new Inteiro();
		Integer divEsperada = 2;
		assertEquals(divEsperada, inteiro.Divisao(10, 5)); 
	}
	
	@Test
	public void ehParTest(){
		Inteiro inteiro = new Inteiro();
		assertTrue(inteiro.ehPar(2));
		assertFalse(inteiro.ehPar(3));
		assertTrue(inteiro.ehPar(10));
	
	}
	
	@Test
	public void ehMaiorTest(){
		Inteiro inteiro = new Inteiro();
		assertTrue(inteiro.ehMaior(10, 5));
		assertFalse(inteiro.ehMaior(22, 30));

	}
	
	
}


