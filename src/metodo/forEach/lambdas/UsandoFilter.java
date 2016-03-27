package metodo.forEach.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsandoFilter {

	public static void main(String[] args) {
		List<Usuario> usuarios = new ArrayList<>();

		
		usuarios.add(new Usuario("Rodrigo", 39, true));
		usuarios.add(new Usuario("Edson", 22, false));
		usuarios.add(new Usuario("Joao Silva", 19, true));
		usuarios.add(new Usuario("Telma Santos", 34, false));
		
		List<Usuario> maior = usuarios.stream().filter(p -> p.getIdade()> 20).collect(Collectors.toList());
		maior.forEach(p -> System.out.println(p.toString()));
		
		System.out.println("Pessoa que iniciam com a  letra E");
		List<Usuario> inicia = usuarios.stream().filter(u -> u.getNome().startsWith("E")).collect(Collectors.toList());
		inicia.forEach(u -> System.out.println(u.toString()));
	}

}
