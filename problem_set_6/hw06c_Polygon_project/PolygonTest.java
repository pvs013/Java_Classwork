import java.awt.Point;

public class PolygonTest
{
 
    public static void main(String[] args)
    {
       
       Polygon shape = new Polygon();
       Point p1 = new Point(0,10);
       Point p2 = new Point(30,40);
       
       shape.addPoint(p1);
       shape.addPoint(p2);
       shape.draw();
       System.out.println("Expected: Draw Line");
       System.out.println(shape.perimeter());
       System.out.println("Expected: 42.42");
       
       Point p3 = new Point(60,10);
       shape.addPoint(p3);
       shape.draw();
       System.out.println("Expected: Draw Triangle");
       System.out.println(shape.perimeter());
       System.out.println("Expected: 144.85");
       
       Point p4 = new Point(40,0);
       shape.addPoint(p4);
       shape.draw();
       System.out.println("Expected: Draw 4 sided");
       System.out.println(shape.perimeter());
       System.out.println("Expected: 148.44");
       
       
       
    }
}
