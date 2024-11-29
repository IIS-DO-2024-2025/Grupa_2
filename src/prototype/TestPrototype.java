package prototype;

import java.awt.Color;

import mvc.Point;

public class TestPrototype {

	public static void main(String[] args) {
		Point p1 = new Point(10, 10, Color.BLACK);
		Point p2 = new Point(20, 20, Color.BLACK);
		
		Line line = new Line(p1, p2, Color.BLACK);
		
		
		// ------ Testiranje shallow clone načina -------
		
		// Pravimo kopiju linije
		Line lineClone = line.clone(); // ---> ne postoji
		
		System.out.println(line);
		System.out.println(lineClone);
		
		line.getStartPoint().setX(500);
		System.out.println(lineClone.getStartPoint().getX());
		
		
		// ------- Testiranje deep clone načina ----------
		Point p3 = new Point(30, 30, Color.BLACK);
		Point p4 = new Point(40, 40, Color.BLACK);
		
		LineDeep line2 = new LineDeep(p3, p4, Color.BLACK);
		LineDeep lineDeep = line2.clone();
		
		System.out.println(line2);
		System.out.println(lineDeep);
		
		//line2.setY
		line2.getStartPoint().setX(500);
		System.out.println(lineDeep.getStartPoint().getX());

	}

}
