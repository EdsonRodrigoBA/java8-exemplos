package metodo.forEach.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class UsandoforEach {

	public static void main(String[] args) {
		
		List<Usuario> usuarios = new ArrayList<>();

		
		usuarios.add(new Usuario("Rodrigo", 39, true));
		usuarios.add(new Usuario("Edson", 22, false));
		usuarios.add(new Usuario("Joao Silva", 19, true));
		usuarios.add(new Usuario("Telma Santos", 34, false));
		
		List<Usuario> maior = usuarios.stream().filter(p -> p.getIdade()> 20).collect(Collectors.toList());
		maior.forEach(p -> System.out.println(p.toString()));
		System.out.println("Pessoa Inicia letra E");
		List<Usuario> inicia = usuarios.stream().filter(u -> u.getNome().startsWith("E")).collect(Collectors.toList());
		inicia.forEach(u -> System.out.println(u.toString()));
		
		
		
		//teste01(usuarios);
		//teste02(usuarios);
		//teste3(usuarios);
	}
	private static void teste3(List<Usuario> usuarios) {
		//todos os usuarios vão passa a ter o status como true.
		usuarios.forEach(u -> u.updateStatus(true));
		
		usuarios.forEach(u-> System.out.println(u));
	}
	/**
	 * Usando expressoes lambda nesse metodo.
	 * FIcou bem mais pratico usando expressoes lambdas.
	 * @param usuarios
	 */
	private static void teste02(List<Usuario> usuarios) {
		/*
		 Este é um jeito de fazer porem nao precisa passa o tipo (Usuario u) pois o lambda ja identifica
		 E as chaves so precisam quando tem mais de uma instrução exemplo, dois Syso.
		Consumer<Usuario> usuarioConsummer = (Usuario u) -> {System.out.println(usuarios.toString());};
		usuarios.forEach(usuarioConsummer);
		*/
		
		//Poderia fica assim:
		Consumer<Usuario> usuarioConsummer = u -> System.out.println(u.toString());
		usuarios.forEach(usuarioConsummer);
	}

	
	/**
	 * Metodo mostra recursos do java8
	 * @param usuarios
	 */
	private static void teste01(List<Usuario> usuarios) {
		
		/*Imprimindo da maneira normal, tradicional java7.
		 * 
		 */
		for(Usuario usuario : usuarios){
			System.out.println(usuario.toString());
		}
		
		
		System.out.println("..................Segunda Forma para imprimir...............................");
		/*
		 * Notem que em apenas uma linha podemos imprimir todos os objetos da lista.
		 * So tivemos que cria uma classe, implementa a iterface consumer nela e chama-la.
		 */
		usuarios.forEach(new UsuarioConsummer());
		
		
		System.out.println("..............Terçeira Forma Imprimir...........................");
		/*
		 * Imprimindo com classe anonima com recusos do java8.
		 */
		Consumer<Usuario> usuarioConsumer = new Consumer<Usuario>() {
			@Override
			public void accept(Usuario u) {
				System.out.println(u.toString());
			}
		};
		usuarios.forEach(usuarioConsumer);
		
		System.out.println("............Quarta Forma Imprimir .........................");
		usuarios.forEach(System.out::println);
	}

}
