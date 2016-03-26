package exemplo.lambdas;

import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import javax.swing.JButton;

public class TestLambda {
	private static JButton buton = new JButton("teste");
	
	
	public static void main(String[] args) {
	 Set<String> nomes = new HashSet<>();
	 List<String> nomes1 = new LinkedList<>();
	 
	 nomes.add("A");
	 nomes.add("b");
	 nomes.add("c");
	 nomes.add("d");
	 nomes.forEach(System.out::println);
	 
	 //metodo conta quantas letras c tem na lista.
	Long l = nomes.stream().filter(s -> s.equals("c")).count();
	System.out.println(l);
	 
	 /**
		metodo que recebe a interface funcional e faz o calculo.
		double soma =Calcula.calcula(200d, 300d, (x,y) -> x + y);
		System.out.println(soma);
	  */
	}

	public void semLambda(){
		buton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicou");
			}
		});
	}
	
	/**
	 * Usou apenas uma linha de codigo
	 */
	public void comLambda(){
		buton.addActionListener((event)-> imprimiTexto(event));
	}
	
	//para imrprimir os dois texto quando clica no botao.
	public void imprimiTexto(ActionEvent event){
		System.out.println("Imrpimir texto um");
		System.out.println("Imprimir texto dois");
	}
}
