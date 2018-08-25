package br.com.db1.aula03;

public class Portugues {
	
	public String textoEmMaiuscula(String texto) {
		return texto.toUpperCase();
	}
	
	public String textoEmMinuscula(String texto) {
		return texto.toLowerCase();
	}
	
	public Integer contarLetras(String texto) {
		return texto.length();
	}
	
	public Integer contarLetras2(String texto) {
		return texto.length();
	}
	
	public Integer contarLetras3(String texto) {
		String textoNovo = texto.trim();
		return textoNovo.length();
	}
	
	public String exibir4LetrasDoNome(String nome) {
		return nome.substring(0, 4);
	}
	
	public String exibirDaTerceiraLetraEmDianteNome(String nome) {
		return nome.substring(3);
	}
	
	public String exibir4UltimasLetras(String nome) {
		return nome.substring(nome.length()-4);
	}
}
