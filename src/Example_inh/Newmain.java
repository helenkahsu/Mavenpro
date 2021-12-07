package Example_inh;

public class Newmain {

	public Newmain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Circle circle=new Circle(3.5);
		System.out.println("area of the circle :"+circle.getRadius());
    System.out.println("area of the circle :"+circle.getArea());
    
    Cylinder clinder=new Cylinder(5.55,7.25);
    System.out.println("heiht of the clinder :"+clinder.getHeight());
    System.out.println("volum of the clinder :"+clinder.getVolum());
	}

}
