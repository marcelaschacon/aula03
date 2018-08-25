package br.com.db1.aula03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.db1.aula03.Matematica;

public class MatematicaTest {
	
	@Test
	public void menorValorEntreDoisDoublesTest() {
		Matematica matematica = new Matematica();
		assertTrue(matematica.menorValor(8, 8.5));
		assertFalse(matematica.menorValor(10, 8));
		
	}
	
	@Test
	public void menorValorEntreTresDoublesTest() {
		Matematica matematica = new Matematica();
		assertEquals(5, matematica.menorValor3Numeros(5, 12, 17), 0);
		
	}
	
	@Test
	public void mediaAritmeticaTest() {
		Matematica matematica = new Matematica();
		assertEquals(10, matematica.mediaAritmetica(10, 10, 10), 0);
		
	}
	
	@Test
	public void areaTriangulo() {
		Matematica matematica = new Matematica();
		assertEquals(50, matematica.areaTriangulo(10, 10), 0);
		
	}
}
