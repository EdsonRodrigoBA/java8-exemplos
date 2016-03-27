package metodo.forEach.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		System.out.println("Imprimir todos os numeros: ");
		//avaliaexPressao(numeros,(n)-> true);
		
		System.out.println("Imprimir so os pares:");
		//avaliaexPressao(numeros, (n)-> n%2 == 0);

		System.out.println("Imprimindo impares: ");
		//avaliaexPressao(numeros, (n)-> n%2 != 0);
		System.out.println();
		
		//Exibindo o quadrado de cada numero da lista
		realizaOperacao(numeros, (n)-> n * n);
	}

	private static void realizaOperacao(List<Integer> numeros, IntFunction<Integer> intFunction) {
		numeros.forEach(n -> {
			n = intFunction.apply(n);
			System.out.print(n + " ");	
		});
	}

	private static void avaliaexPressao(List<Integer> numeros, Predicate<Integer> predicate) {
		
		numeros.forEach(n -> {
			if(predicate.test(n)){
				System.out.print(n + " ");
				}
			
			});	
		System.out.println();
	}

}
