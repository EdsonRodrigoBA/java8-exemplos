package manipulando.arquivos.streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Classe que mostra diferença na manipulação de arquivo com java.
 * Esta classe mostra a forma antiga antes do java, observem o tanto de linha de codigo
 * que precisava-se para ler um arquivo txt.
 * @author Edson
 *
 */
public class FormaAntiga {

	public static void main(String[] args) throws IOException {
		new FormaAntiga().readFileAntigo2();
	}
	
	/**
	 * Metodo que faz a leitura do arquivo txt usando a classe FileRead do java7, em uma pasta que 
	 * esta no meu disco c:/. Lembrando que para voce ultiliza o exemplo , crie um arquivo txt com algum conteudo dentro.
	 * e referencie o local que voce salvo abaixo.
	 * @throws IOException
	 */
	public void readFileAntigo1() throws IOException{
		
		try {
			/*
			 *Apontando local onde esta salvo o arquivo txt.
			 */
			FileReader fileReader = new FileReader(new File("C:/java 8/java8.txt"));
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String linha;
			
			while(bufferedReader.readLine() != null){
				linha = bufferedReader.readLine();
				System.out.println(linha);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Metodo que faz a leitura do arquivo txt usando a classe Files e Paths do java7, em uma pasta que esta no meu disco c:/
	 * Lembrando que para voce ultiliza o exemplo , crie um arquivo txt com algum conteudo dentro.
	 * e referencie o local que voce salvo abaixo.
	 * @throws IOException
	 */
	public void readFileAntigo2(){
		/*
		 *Apontando local onde esta salvo o arquivo txt.
		 */
		try {
			List<String> lista = Files.readAllLines(Paths.get("C:/java 8/java8.txt"));
			for(String linha : lista){
				System.out.println(linha);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
