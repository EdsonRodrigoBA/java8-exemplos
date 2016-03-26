package metodo.forEach.lambdas;

import java.util.function.Consumer;
/**
 * Classe implementadora do objeto do tipo consummer.
 * @author Edson
 *
 */
public class UsuarioConsummer implements Consumer<Usuario>{

	@Override
	public void accept(Usuario u) {
		System.out.println(u);
		
	}

}
