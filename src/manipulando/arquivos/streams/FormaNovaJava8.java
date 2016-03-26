package manipulando.arquivos.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FormaNovaJava8 {
	private String nome = nome = "C:/java 8/java8.txt";
	
	public static void main(String[] args) {
		
	}
	
	public void readFileNovo1() throws IOException{
		/**
		 * Observe so como ficou simples usando stream, nao precisamos cria while,
		 * e dentro do forEach, usamos :: , que ele automaticamente sabe que estamos lendo linha a linha.
		 * caso nao rode no seu pc , as vezes preciaamos passa apos o Paths.get(nome), 
		 * o StandardCharsets.ISO_8859_1
		 */
		try(Stream<String> stream = Files.lines(Paths.get(nome))){
			stream.forEach(System.out::println);
		}
	}
	
	/**
	 * Busquei tudo que ta dentro da do arquivo txt, e o converti para maiusculo.
	 * @throws IOException
	 */
	public void reaFileNovo2() throws IOException{
		List<String> lista = new ArrayList<>();
		try(Stream<String> stream = Files.lines(Paths.get(nome))){
			stream.forEach(System.out::println);
			lista = stream.map(String::toUpperCase).collect(Collectors.toList()); 
		}
		lista.forEach(System.out::println);
	}

}
