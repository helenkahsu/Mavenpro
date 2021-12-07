package Example_inh;

public class Circle {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
		
	}

	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}

}

	
