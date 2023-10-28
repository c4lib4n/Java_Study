package entities;

public class Triangle {
	
	public double a;
	public double b;
	public double c;

	public double area() {
		double P = (a + b + c )/ 2.0;
		return Math.sqrt(P *(P - a) * (P - b) * (P - c));
	}

}
