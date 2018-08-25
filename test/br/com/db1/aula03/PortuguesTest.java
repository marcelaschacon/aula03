package br.com.db1.aula03;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.db1.aula03.Portugues;

public class PortuguesTest {
		
	@Test
	public void textoEmMaiusculasTest() {
		Portugues portugues = new Portugues();
		String textoEsperado = "TESTE";
		assertEquals(textoEsperado, portugues.textoEmMaiuscula("teste"));
	}
	
	@Test
	public void textoEmMinusculasTest() {
		Portugues portugues = new Portugues();
		String textoEsperado = "teste";
		assertEquals(textoEsperado, portugues.textoEmMinuscula("TESTE"));
	}
	
	@Test
	public void contarLetrasTest() {
		Portugues portugues = new Portugues();
		Integer valorEsperado = 8;
		assertEquals(valorEsperado, portugues.contarLetras("DB1START"));
		
	}
	
	@Test
	public void contarLetras2Test() {
		Portugues portugues = new Portugues();
		Integer valorEsperado = 10;
		assertEquals(valorEsperado, portugues.contarLetras(" DB1START "));
		
	}
	
	@Test
	public void retornarMesmaQuantidadeDeLetrasTest() {
		Portugues portugues = new Portugues();
		Integer valorEsperado = 8;
		assertEquals(valorEsperado, portugues.contarLetras3(" DB1START "));
		
	}
	
	@Test
	public void exibir4LetrasDoNomeTest() {
		Portugues portugues = new Portugues();
		String textoEsperado = "João";
		assertEquals(textoEsperado, portugues.exibir4LetrasDoNome("João Lacerda Nascimento"));
	}
	
	@Test
	public void exibirDaTerceiraLetraEmDianteTest() {
		Portugues portugues = new Portugues();
		String textoEsperado = "o Lacerda Nascimento";
		assertEquals(textoEsperado, portugues.exibirDaTerceiraLetraEmDianteNome("João Lacerda Nascimento"));
	}
	
	@Test
	public void exibir4UltimasLetrasTest() {
		Portugues portugues = new Portugues();
		String textoEsperado = "ento";
		assertEquals(textoEsperado, portugues.exibir4UltimasLetras("João Lacerda Nascimento"));
	}
	
	
}
