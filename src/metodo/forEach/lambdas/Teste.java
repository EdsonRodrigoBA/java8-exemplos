package metodo.forEach.lambdas;

public class Teste {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Therad criada");
			}
		};
		new Thread(runnable).start();
		
		
		Runnable r = ()-> System.out.println("New Thread");
		new Thread(r).start();
	}


}
