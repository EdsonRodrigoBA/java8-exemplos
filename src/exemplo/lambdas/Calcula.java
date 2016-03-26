package exemplo.lambdas;

import java.util.function.BinaryOperator;

public class Calcula {
	
	public static double calcula(double x, double y, BinaryOperator<Double> binary){
		return binary.apply(x, y);
		
	}
}
