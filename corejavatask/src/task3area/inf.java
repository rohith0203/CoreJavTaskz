package task3area;

import task3area.Shapes.circle;
import task3area.Shapes.square;
import task3area.Shapes.triangle;

public class inf {
public static void main(String[] args) {
	Shapes s=new Shapes();
	circle c=s.new circle();
	c.area(3.14, 2);
	c.perimeter(3.14, 2);
	triangle t=s.new triangle();
	t.area(2, 3);
	t.perimeter(2, 3, 4);
	square q=s.new square();
	q.area(3);
	q.perimeter(2, 3);
}
}
