package shape;

public class ShapeApp {
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setX(2);
		p1.setY(5);
		
		Point p2 = new Point();
		p2.setX(10);
		p2.setY(23);
		
		Point p3 = new Point(50, 50);
		
		Point p4 = new ColorPoint(55, 150, "red");
		
		p1.show();
		p2.show();
		p3.show();
		p3.show();
		p4.show();
	}
}
